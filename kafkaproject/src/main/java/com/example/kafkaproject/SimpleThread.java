package com.example.kafkaproject;

public class SimpleThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hiiiiii");
	}
	
	public static void main(String args[]) {
		
		Thread t =new Thread(new SimpleThread());
		t.start();
	}

}
