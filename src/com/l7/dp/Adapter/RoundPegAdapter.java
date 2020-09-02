package com.l7.dp.Adapter;

public class RoundPegAdapter extends SquarePeg {
	
	private RoundPeg rpeg;
	
	public RoundPegAdapter(RoundPeg rpeg) {
		this.rpeg=rpeg;
	}
	
	@Override
	public double getWidth() {
		// TODO Auto-generated method stub
		return rpeg.getRadius()*2;
	}
	
	
}
