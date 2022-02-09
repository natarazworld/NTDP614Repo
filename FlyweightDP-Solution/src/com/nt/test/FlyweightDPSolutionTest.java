package com.nt.test;

import com.nt.comp.Circle;
import com.nt.comp.Square;
import com.nt.factory.ShapeFactory;

public class FlyweightDPSolutionTest {

	public static void main(String[] args) {
		
		System.out.println("======Drawing Circle Shapes======");
		for(int i=1;i<=100;++i) {
			Circle circle=(Circle)ShapeFactory.getInstance("circle");
			circle.draw(i+10, "red", "dashed");
		}
		System.out.println("=====Drawing==Square===Shapes=======");
		for(int i=1;i<=100;++i) {
			Square square=(Square)ShapeFactory.getInstance("square");
			square.draw(i+10, "blue", "dashed");
		}
		

	}

}
