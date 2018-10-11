package com.giveu.admin.designmode.factory;

public class SmsSender implements Sender {
	@Override
	public void send() {
		System.out.println("send sms...");
	}
}
