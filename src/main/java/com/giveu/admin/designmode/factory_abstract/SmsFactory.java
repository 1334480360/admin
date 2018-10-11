package com.giveu.admin.designmode.factory_abstract;

import com.giveu.admin.designmode.factory.Sender;
import com.giveu.admin.designmode.factory.SmsSender;

public class SmsFactory implements SendProvider {
	@Override
	public Sender produce() {
		return new SmsSender();
	}
}
