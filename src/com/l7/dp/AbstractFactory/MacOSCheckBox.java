package com.l7.dp.AbstractFactory;

public class MacOSCheckBox implements CheckBox {
	@Override
	public void paint() {
		System.out.println("This is mac os checkbox");
	}
}
