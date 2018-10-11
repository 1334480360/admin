package com.giveu.admin.designmode.factory_static;

import com.giveu.admin.designmode.factory.Sender;

public class Test {
	public static void main(String[] args) {

		Sender smsSender = SendFactory.produceSms();
		smsSender.send();

		Sender mailSender = SendFactory.produceMail();
		mailSender.send();
	}
}
