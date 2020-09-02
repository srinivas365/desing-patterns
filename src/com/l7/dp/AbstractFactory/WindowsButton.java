package com.l7.dp.AbstractFactory;

public class WindowsButton implements Button {
	@Override
	public void paint() {
		System.out.println("this is windows button");
	}
}
