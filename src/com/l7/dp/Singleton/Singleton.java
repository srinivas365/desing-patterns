package com.l7.dp.Singleton;

public class Singleton {
	private static Singleton instance;
	public String text="hello world";
	private Singleton(String text) {
		this.text=text;
	}
	public static Singleton getInstance(String text) {
		if(instance==null) {
			instance=new Singleton(text);
		}
		return instance;
	}
	
	
}
