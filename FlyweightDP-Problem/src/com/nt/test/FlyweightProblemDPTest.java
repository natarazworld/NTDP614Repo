package com.nt.test;

import com.nt.comp.Circle;
import com.nt.comp.Square;

public class FlyweightProblemDPTest {

	public static void main(String[] args) {
		
		System.out.println("======Drawing Circle Shape======");
		for(int i=1;i<=1000;++i) {
			Circle circle=new Circle();
			circle.draw(i+10, "red", "dashed");
		}
		System.out.println("=====Drawing==Square===Shape=======");
		for(int i=1;i<=1000;++i) {
			Square square=new Square();
			square.draw(i+10, "blue", "dashed");
		}
		

	}

}
