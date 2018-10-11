package com.giveu.admin.designmode.factory;

public class Test {
	public static void main(String[] args) {
		SendFactory factory = new SendFactory();

		Sender smsSender = factory.produce("sms");
		smsSender.send();

		Sender mailSender = factory.produce("mail");
		mailSender.send();
	}
}
