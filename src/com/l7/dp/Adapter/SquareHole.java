package com.l7.dp.Adapter;

public class SquareHole {
	private double width;
	public SquareHole(double width) {
		// TODO Auto-generated constructor stub
		this.width=width;
	}
	
	public boolean isFit(SquarePeg peg) {
		return peg.getWidth()<=width?true:false;
	}
}
