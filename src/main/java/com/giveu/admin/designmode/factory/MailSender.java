package com.giveu.admin.designmode.factory;

public class MailSender implements Sender {
	@Override
	public void send() {
		System.out.println("send mail...");
	}
}
