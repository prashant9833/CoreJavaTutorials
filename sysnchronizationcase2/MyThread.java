package com.demo.sysnchronizationcase2;

public class MyThread extends Thread {
	
	Display d;
	String name;
	
	public MyThread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	
	public void run()
	{
		d.wish(name);
	}

}
