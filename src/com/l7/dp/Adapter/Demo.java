package com.l7.dp.Adapter;

public class Demo {
	public static void main(String[] args) {
		RoundHole hole5=new RoundHole(5);
		RoundHole hole7=new RoundHole(7);
		
		RoundPeg peg5=new RoundPeg(5);
		RoundPeg peg6=new RoundPeg(4);
		RoundPeg peg10=new RoundPeg(10);
		
		System.out.println(hole5.isFit(peg5));
		System.out.println(hole5.isFit(peg6));
		System.out.println(hole7.isFit(peg5));
		System.out.println(hole7.isFit(peg6));
		System.out.println(hole5.isFit(peg10));
		System.out.println(hole7.isFit(peg10));
		
		
		SquareHole shole5=new SquareHole(5);
		SquareHole shole7=new SquareHole(7);
		SquareHole shole10=new SquareHole(10);
		
		SquarePeg speg5=new SquarePeg(5);
		SquarePeg speg6=new SquarePeg(4);
		SquarePeg speg10=new SquarePeg(10);
		
		System.out.println(shole5.isFit(speg5));
		System.out.println(shole5.isFit(speg6));
		System.out.println(shole7.isFit(speg5));
		System.out.println(shole7.isFit(speg6));
		System.out.println(shole5.isFit(speg10));
		System.out.println(shole7.isFit(speg10));
		
		System.out.println("Adapter");
		
		SquarePegAdapter spad=new SquarePegAdapter(speg5);
		
		System.out.println(hole5.isFit(spad));
		
		System.out.println(spad.getRadius());
		
		RoundPegAdapter rpadPeg=new RoundPegAdapter(peg5);
		System.out.println(rpadPeg.getWidth());
		System.out.println(shole10.isFit(rpadPeg));
		
	}
}	
