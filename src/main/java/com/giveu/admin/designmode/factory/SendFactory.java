package com.giveu.admin.designmode.factory;

public class SendFactory {
	public Sender produce(String type) {
		switch (type) {
			case "mail":
				return new MailSender();
			case "sms":
				return new SmsSender();
			default:
				return null;
		}
	}
}
