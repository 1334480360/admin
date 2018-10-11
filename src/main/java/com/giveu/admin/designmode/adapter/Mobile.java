package com.giveu.admin.designmode.adapter;

//将一个类的接口转换成客户期望的另一个接口，适配器让原本接口不兼容的类可以相互合作。这个定义还好，说适配器的功能就是把一个接口转成另一个接口。
public class Mobile {
	public void inputPower(V5Power power) {
		int provide5Power = power.provideV5Power();
		System.out.println("手机（客户端）：我需要5v电压，现在电压是 " + provide5Power + "v");
	}
}
