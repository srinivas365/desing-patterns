package com.l7.dp.Adapter;

public class RoundHole {
	private double radius;
	public RoundHole(double radius) {
		 this.radius=radius;
	}
	public boolean isFit(RoundPeg peg) {
		return peg.getRadius()<=radius?true:false;
	}
}
