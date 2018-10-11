package com.giveu.admin.designmode.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @title：主题实现类
 * @author：xuan
 * @date：2018/9/4
 */
public class ObjectFor3D implements Subject {
	private List<Observer> observers = new ArrayList<>();

	private String msg;

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		if (index > -1) {
			observers.remove(index);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(msg);
		}
	}

	/**
	 * @title：主题更新消息
	 */
	public void setMsg(String msg) {
		this.msg = msg;
		this.notifyObservers();
	}
}
