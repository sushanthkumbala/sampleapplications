package com.example.kafkaproject;

import java.util.List;

public class Shipments {
	
	private List<Iteams> iteamsList;

	public List<Iteams> getIteamsList() {
		return iteamsList;
	}

	public void setIteamsList(List<Iteams> iteamsList) {
		this.iteamsList = iteamsList;
	}

	public Shipments(List<Iteams> iteamsList) {
		super();
		this.iteamsList = iteamsList;
	}
	
	

}
