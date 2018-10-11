package com.giveu.admin.designmode.observer;

public class Test {
	public static void main(String[] args) {
		ObjectFor3D subject = new ObjectFor3D();

		Observer1 observer1 = new Observer1(subject);
		Observer2 observer2 = new Observer2(subject);

		subject.setMsg("彩票开奖号码：123");
		subject.setMsg("彩票开奖号码：234");


	}
}
