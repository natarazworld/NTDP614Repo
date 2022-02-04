package com.nt.comps;

public class DryFruitVanilaIcecream extends VanilaIcecream {

	@Override
	public void prepare() {
		System.out.println("preparing  Vanila-IceCream");
		addDryFruits();

	}
	
	public void   addDryFruits() {
		System.out.println("Adding DryFruits.....");
	}

}
