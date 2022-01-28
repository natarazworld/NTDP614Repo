//Dependent class
package com.nt.comps;

public final class BlueDart implements Courier {
	public BlueDart() {
		System.out.println("BlueDart:: 0-param constructor");
	}

	@Override
	public String deliverOrder(int oid) {
		
		return oid+" order id order products are delivered by BlueDart Courier Service";
	}

}
