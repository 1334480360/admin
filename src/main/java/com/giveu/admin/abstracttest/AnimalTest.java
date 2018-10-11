package com.giveu.admin.abstracttest;

public class AnimalTest {
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.run();

		Animal cat = new Cat();
		cat.run();
	}
}
