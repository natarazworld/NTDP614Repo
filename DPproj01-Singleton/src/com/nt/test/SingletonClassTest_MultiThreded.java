package com.nt.test;

public class SingletonClassTest_MultiThreded {
	public static void main(String[] args) {
		//create Threads with data
		  TicketBookingOperation  operation=new TicketBookingOperation();
		Thread th1=new Thread(operation);
		Thread th2=new Thread(operation);
		Thread th3=new Thread(operation);
		
		//start  threads
		th1.start();
		th2.start();
		try {
			Thread.sleep(20000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		th3.start();
		
		/*	try {
			Class.forName("com.nt.sdp.Printer2");
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
		
		
	}

}
