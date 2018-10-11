package com.giveu.admin.designmode.factory_abstract;

import com.giveu.admin.designmode.factory.MailSender;
import com.giveu.admin.designmode.factory.Sender;

public class MailFactory implements SendProvider {
	@Override
	public Sender produce() {
		return new MailSender();
	}
}
