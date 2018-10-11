package com.giveu.admin.redis;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.data.redis.core.ValueOperations;

import java.util.concurrent.TimeUnit;

/**
 * @title：redis分布式锁
 * @author：xuan
 * @date：2018/9/3
 */
public class RedisLock {
	private ValueOperations<String, String> valOpt;
	private ICacheKey cacheKey;
	private String value;
	private boolean lock = false;

	public RedisLock(ValueOperations<String, String> valOpt, ICacheKey cacheKey) {
		this.valOpt = valOpt;
		this.cacheKey = cacheKey;
	}

	/**
	 * @title：获取锁
	 * @author：xuan
	 * @date：2018/9/3
	 */
	public boolean lock() {
		long currentTime = System.nanoTime();
		this.value = String.valueOf(currentTime) + TimeUnit.NANOSECONDS.convert(cacheKey.getExpirationTime(), cacheKey.getExpirationTimeUnit());
		try {
			//正常情况下拿到锁
			if (valOpt.setIfAbsent(this.cacheKey.toString(), this.value)) {
				valOpt.getOperations().expire(cacheKey.toString(), cacheKey.getExpirationTime(), cacheKey.getExpirationTimeUnit());
				this.lock = true;
				return this.lock;
			}

			//上一个锁时间到了异常情况下没有释放，该情况也应该拿到锁
			long lastValue = NumberUtils.toLong(valOpt.get(cacheKey.toString()));
			if (currentTime > lastValue) {
				valOpt.set(cacheKey.toString(), this.value, cacheKey.getExpirationTime(), cacheKey.getExpirationTimeUnit());
				this.lock = true;
				return this.lock;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return this.lock;
	}

	/**
	 * @title：释放锁
	 * @author：xuan
	 * @date：2018/9/3
	 */
	public boolean release() {
		try {
			if (this.lock) {
				String lastValue = valOpt.get(cacheKey.toString());
				if (StringUtils.isNotBlank(lastValue) && this.value.equals(lastValue)) {
					valOpt.getOperations().delete(cacheKey.toString());
					this.lock = false;
					return true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

}
