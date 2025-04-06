package com.sd.java;

import com.sd.java.context.NavigatorContext;
import com.sd.java.strategy.RoadStrategy;
import com.sd.java.strategy.TransportStrategy;
import com.sd.java.strategy.WalkingStrategy;

public class Client {

	public static void main(String[] args) {
		String pointA = "34/45 Madhapur, Hyderabad";
		String pointB = "4/89 Jubille Hills, Hyderabad";
		
		NavigatorContext navigator = new NavigatorContext();
		
		//for car roads
		navigator.setStrategy(new RoadStrategy());
		navigator.buildRoute(pointA, pointB);
		
		//for walking roads
	    navigator.setStrategy(new WalkingStrategy());
		navigator.buildRoute(pointA, pointB);
		
		//for public transport roads
	    navigator.setStrategy(new TransportStrategy());
		navigator.buildRoute(pointA, pointB);
	}

}
