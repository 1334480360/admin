package com.giveu.admin.designmode.adapter;

public class Test {
	public static void main(String[] args) {
//		给手机充电
		Mobile mobile = new Mobile();
		V5Power v5Power = new V5PowerAdapter(new V220Power());
		mobile.inputPower(v5Power);
	}
}
