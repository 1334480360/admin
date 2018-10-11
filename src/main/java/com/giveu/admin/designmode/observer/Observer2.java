package com.giveu.admin.designmode.observer;

public class Observer2 implements Observer {
	private Subject subject;

	public Observer2(Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}

	@Override
	public void update(String msg) {
		System.out.println("observer2 update.msg: " + msg);
	}
}
