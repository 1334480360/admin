package com.giveu.admin.designmode.singleton_inner;

public class Singleton {
	private Singleton() {
	}

	// 内部类方式：线程安全、延时加载、高效（推荐用）
	private static class SingletonHolder {
		private static Singleton instance = new Singleton();
	}

	public static Singleton getInstance() {
		return SingletonHolder.instance;
	}
}
