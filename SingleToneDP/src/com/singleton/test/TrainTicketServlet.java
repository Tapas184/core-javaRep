package com.singleton.test;

import com.singleton.Printer;

public class TrainTicketServlet implements Runnable {

	@Override
	 public void run() {
		Printer p = null;
		p=Printer.getInstance();
		System.out.println(Thread.currentThread().getName()+"......"+p.hashCode());
	}
	
}
