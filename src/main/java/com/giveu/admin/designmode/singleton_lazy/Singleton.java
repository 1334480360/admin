package com.giveu.admin.designmode.singleton_lazy;

public class Singleton {
	private static Singleton instance = null;

	public Singleton() {
	}

	// 线程不安全，不可用
	/*public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}*/


	// 线程安全，效率低不推荐使用
	/*public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}*/

	// 线程不安全
	/*public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				instance = new Singleton();
			}
		}

		return instance;
	}*/

	// 线程安全，延时加载，效率高（推荐用）
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

}
