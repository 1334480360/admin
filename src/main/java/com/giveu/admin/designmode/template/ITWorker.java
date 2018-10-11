package com.giveu.admin.designmode.template;

public class ITWorker extends Worker {
	public ITWorker(String name) {
		super(name);
	}

	@Override
	public void work() {
		System.out.println(name + "：敲代码--写bug");
	}
}
