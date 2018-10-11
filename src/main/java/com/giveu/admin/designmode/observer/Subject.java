package com.giveu.admin.designmode.observer;

/**
 * @title：主题
 * @author：xuan
 * @date：2018/9/4
 */
public interface Subject {
	/**
	 * @title：订阅
	 */
	void registerObserver(Observer observer);

	/**
	 * @title：取消订阅
	 */
	void removeObserver(Observer observer);

	/**
	 * @title：通知所有观察者
	 */
	void notifyObservers();
}
