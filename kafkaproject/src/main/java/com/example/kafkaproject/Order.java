package com.example.kafkaproject;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
	
	private List<Shipments> shipList;

}
