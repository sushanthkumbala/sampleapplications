package com.example.kafkaproject;

public class Iteams {
	
	private int Id;
	private String iteamName;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getIteamName() {
		return iteamName;
	}

	public void setIteamName(String iteamName) {
		this.iteamName = iteamName;
	}

	public Iteams(int id, String iteamName) {
		super();
		Id = id;
		this.iteamName = iteamName;
	}

	
	

}
