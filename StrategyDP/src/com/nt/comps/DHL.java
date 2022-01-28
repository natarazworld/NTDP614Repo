//Dependent class
package com.nt.comps;

public final class DHL implements Courier {
	
	public DHL() {
		System.out.println("DHL:: 0-param constructor");
	}

	@Override
	public String deliverOrder(int oid) {
		
		return oid+" order id order products are delivered by DHL Courier Service";
	}

	
}
