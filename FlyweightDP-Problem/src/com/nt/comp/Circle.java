package com.nt.comp;

public class Circle  implements Shape {
	private String label;  //instrinsic data
	 public Circle() {
		 System.out.println("Circle:: 0-param constructor");
		label="circle";
	}
	 
	 @Override
	public void draw(int radius, String fillColor, String lineStyle) {  // extrinsic data
		System.out.println("drawing Circle with radius::"+radius +" having fillColor::"+fillColor+" and line Style::"+lineStyle);
	}

}
