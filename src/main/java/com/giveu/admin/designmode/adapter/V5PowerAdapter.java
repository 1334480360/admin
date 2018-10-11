package com.giveu.admin.designmode.adapter;

public class V5PowerAdapter implements V5Power {
	private V220Power v220Power;

	public V5PowerAdapter(V220Power v220Power) {
		this.v220Power = v220Power;
	}

	@Override
	public int provideV5Power() {
		int power = v220Power.provideV220Power();
		System.out.println("适配器：我适配了电压220v --> 5v");
		return 5;
	}
}
