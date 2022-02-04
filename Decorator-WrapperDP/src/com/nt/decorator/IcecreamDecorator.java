//Abstract Decorator class
package com.nt.decorator;

import com.nt.comp.Icecream;

public abstract class IcecreamDecorator  implements Icecream{
	//HAS-A property
	private Icecream  icecream;
	
	public IcecreamDecorator(Icecream icecream) {
       this.icecream=icecream;
	}
	
	@Override
	public void prepare() {
	    icecream.prepare();
	}
	
}
