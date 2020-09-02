package com.l7.dp.AbstractFactory;

public class Demo {
	public static void main(String[] args) {
		Application windowsApp=new Application(new WindowsFactory());
		windowsApp.paint();
		
		Application macApp=new Application(new MacOSFactory());
		macApp.paint();
		
	}
}
