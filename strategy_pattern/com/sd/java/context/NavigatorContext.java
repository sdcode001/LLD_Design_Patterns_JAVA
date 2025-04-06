package com.sd.java.context;

import com.sd.java.strategy.RouteStrategy;

public class NavigatorContext {
	
	private RouteStrategy strategy;
	
	public void setStrategy(RouteStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void buildRoute(String pointA, String pointB) {
		this.strategy.buildRoute(pointA, pointB);
	}
    
}
