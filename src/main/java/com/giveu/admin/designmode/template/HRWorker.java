package com.giveu.admin.designmode.template;

public class HRWorker extends Worker {
	public HRWorker(String name) {
		super(name);
	}

	@Override
	public void work() {
		System.out.println(name + "：看简历--打电话");
	}
}
