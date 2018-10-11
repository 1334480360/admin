package com.giveu.admin.designmode.singleton_hungry;

public class Singleton {
	private static Singleton instance = new Singleton();

	public Singleton() {
		// 饿汉式变换写法
//		instance = new Singleton();
	}

	public static Singleton getInstance() {
		return instance;
	}
}
