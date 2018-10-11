package com.giveu.admin.designmode.factory_static;

import com.giveu.admin.designmode.factory.MailSender;
import com.giveu.admin.designmode.factory.Sender;
import com.giveu.admin.designmode.factory.SmsSender;

public class SendFactory {

	public static Sender produceMail() {
		return new MailSender();
	}

	public static Sender produceSms() {
		return new SmsSender();
	}
}
