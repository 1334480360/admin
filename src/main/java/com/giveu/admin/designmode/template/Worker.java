package com.giveu.admin.designmode.template;

public abstract class Worker {
	protected String name;

	public Worker(String name) {
		this.name = name;
	}

	public final void workOneDay() {
		System.out.println("---------work start-----------------");
		enterCompany();
		computerOn();
		work();
		computerOff();
		leaveCompany();
		System.out.println("---------work end-----------------");
	}

	public abstract void work();

	private void computerOn() {
		System.out.println(name + "打开电脑");
	}

	private void computerOff() {
		System.out.println(name + "关闭电脑");
	}

	public void enterCompany() {
		System.out.println(name + "进入公司");
	}

	public void leaveCompany() {
		System.out.println(name + "离开公司");
	}
}
