package com.giveu.admin.threadtest;

public class TestThread {
	private int j;

	public synchronized void inc() {
		j++;
		System.out.println(Thread.currentThread().getName() + "-inc." + j);
	}

	public synchronized void dec() {
		j--;
		System.out.println(Thread.currentThread().getName() + "-dec." + j);
	}

	public static void main(String[] args) {
		TestThread tt = new TestThread();
		for (int i = 0; i < 2; i++) {
			Thread inc = new Thread(new Inc(tt));
			Thread dec = new Thread(new Dec(tt));
			inc.start();
			dec.start();
		}
	}
}
