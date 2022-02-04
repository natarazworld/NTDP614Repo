package com.nt.test;

import com.nt.comp.ButterScotchIceCream;
import com.nt.comp.Icecream;
import com.nt.decorator.ChocoChipsDecorator;
import com.nt.decorator.DryFruitDecorator;
import com.nt.decorator.HoneyDecorator;

public class DecoratorDPTest {

	public static void main(String[] args) {
		System.out.println("=== case1  (eathing plain ButterscotchIcecream) =====");
		  Icecream cream=new ButterScotchIceCream();
		  cream.prepare();
		  
		  System.out.println("==case2==(eating ==Honey=ButterScotchIceCream)=====");
		  Icecream cream1=new HoneyDecorator(new ButterScotchIceCream());
		  cream1.prepare();
		  
		  System.out.println("==case3==(eating ==Drfruit Honey= Chocochips=ButterScotchIceCream)=====");
		  Icecream cream2=new ChocoChipsDecorator(new DryFruitDecorator(new HoneyDecorator(new ButterScotchIceCream())));
		  cream2.prepare();


	}

}
