package com.nt.comps;

public class HoneyDryFruitVanilaIcecream extends DryFruitVanilaIcecream {

	@Override
	public void prepare() {
		super.prepare();
		addHoney();
	}
	
	public void   addHoney() {
		System.out.println("Adding Honey.....");
	}

}
