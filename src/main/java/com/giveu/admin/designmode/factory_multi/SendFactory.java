package com.giveu.admin.designmode.factory_multi;

import com.giveu.admin.designmode.factory.MailSender;
import com.giveu.admin.designmode.factory.Sender;
import com.giveu.admin.designmode.factory.SmsSender;

public class SendFactory {
	public Sender produceMail() {
		return new MailSender();
	}

	public Sender produceSms() {
		return new SmsSender();
	}
}
