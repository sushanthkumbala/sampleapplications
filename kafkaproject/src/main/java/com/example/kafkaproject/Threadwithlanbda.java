package com.example.kafkaproject;

public class Threadwithlanbda {
	
	public static void main(String args[]) {
		Thread t=new Thread(()-> System.out.println("hiiiii"));
		t.start();
	}

}
