package com.l7.dp.Singleton;

public class Demo {
	public static void main(String[] args) {
		Singleton inst=Singleton.getInstance("vello world");
		System.out.println(inst.text);
		
		Singleton obj=Singleton.getInstance("rello world");
		System.out.println(obj.text);
		
	}
}
