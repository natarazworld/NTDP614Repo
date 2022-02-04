package com.nt.comps;

public class DryFruitButterScotchIcecream extends DryFruitVanilaIcecream {

	@Override
	public void prepare() {
		System.out.println("preparing  ButterScotch-IceCream");
		addDryFruits();
	}
	
	public void  addDryFruits() {
		System.out.println("adding dryfuits....");
	}

}
