package com.giveu.admin.designmode.factory_multi;

import com.giveu.admin.designmode.factory.Sender;

public class Test {
	public static void main(String[] args) {
		SendFactory factory = new SendFactory();

		Sender smsSender = factory.produceSms();
		smsSender.send();

		Sender mailSender = factory.produceMail();
		mailSender.send();
	}
}
