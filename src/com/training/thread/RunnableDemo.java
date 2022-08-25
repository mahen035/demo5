package com.training.thread;

public class RunnableDemo implements Runnable {

	private Thread t;
	private String name;
	
	RunnableDemo(String name){
		this.name = name;
		System.out.println("Creating: "+this.name);
	}
	
	@Override
	public void run() {
		
		System.out.println("Running: "+this.name);
		
		try {
			for(int i=0;i<4;i++) {
				System.out.println("Thread: "+this.name+":"+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
			System.out.println(this.name + " Interrupted");
		}
		System.out.println(this.name + " Exiting..");
		
		
	}
	
	public void startThread() {
		System.out.println("Starting: "+this.name);
		if(t==null) {
			t = new Thread(this, this.name);
			t.start();
		}
	}

}
