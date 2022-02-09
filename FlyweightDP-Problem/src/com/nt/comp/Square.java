package com.nt.comp;

public class Square  implements Shape {
	private String label;  //instrinsic data
	 public Square() {
		 System.out.println("Square::0-param constructor");
		label="square";
	}
	 
	 @Override
	public void draw(int sideLength, String fillColor, String lineStyle) {  // extrinsic data
		System.out.println("drawing Square with side legnth::"+sideLength +" having fillColor::"+fillColor+" and line Style::"+lineStyle);
	}

}
