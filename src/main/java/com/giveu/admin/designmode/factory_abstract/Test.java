package com.giveu.admin.designmode.factory_abstract;

import com.giveu.admin.designmode.factory.Sender;

public class Test {
	public static void main(String[] args) {
		SendProvider mailFactory = new MailFactory();
		SendProvider smsFactory = new SmsFactory();

		Sender mailSender = mailFactory.produce();
		mailSender.send();

		Sender smsSender = smsFactory.produce();
		smsSender.send();

	}
}
