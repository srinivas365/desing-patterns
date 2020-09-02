package com.l7.dp.Adapter;

public class SquarePegAdapter extends RoundPeg {
	
	private SquarePeg speg;
	public SquarePegAdapter(SquarePeg speg){
		this.speg=speg;
	}
	
	@Override
	public double getRadius() {
		// TODO Auto-generated method stub
		return speg.getWidth()/Math.sqrt(2);
	}
	
	
}
