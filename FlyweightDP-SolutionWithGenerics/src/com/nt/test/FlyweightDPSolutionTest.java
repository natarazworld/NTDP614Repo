package com.nt.test;

import com.nt.comp.Circle;
import com.nt.comp.Square;
import com.nt.factory.ShapeFactory;

public class FlyweightDPSolutionTest {

	public static void main(String[] args) {
		
		try {
		System.out.println("======Drawing Circle Shapes======");
		for(int i=1;i<=100;++i) {
			Circle circle=ShapeFactory.getInstance("circle", Circle.class);
			circle.draw(i+10, "red", "dashed");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
		System.out.println("=====Drawing==Square===Shapes=======");
		for(int i=1;i<=100;++i) {
			Square square=ShapeFactory.getInstance("square",Square.class);
			square.draw(i+10, "blue", "dashed");
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
