package com.giveu.admin.designmode.template;

public class Test {
	public static void main(String[] args) {
		Worker worker1 = new ITWorker("小陈");
		worker1.workOneDay();

		Worker worker2 = new HRWorker("小张");
		worker2.workOneDay();

		Worker worker3 = new QAWorker("小罗");
		worker3.workOneDay();
	}
}
