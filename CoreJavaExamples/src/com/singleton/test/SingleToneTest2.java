package com.singleton.test;

public class SingleToneTest2 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		TrainTicketServlet servlet = null;
		servlet  = new TrainTicketServlet();
		
		Thread req1= new Thread(servlet);
		Thread req2 = new Thread(servlet);
		req1.start();
		req2.start();

	}

}
