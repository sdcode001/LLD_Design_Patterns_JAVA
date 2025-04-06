package com.sd.java.factory;

import com.sd.java.entity.Product;

public abstract class ProductCreator implements Product{

	@Override
	public void doStuff() {
		// TODO Auto-generated method stub
		
	}
	
	public void someOperation() {
		
	}
	
	public abstract Product createProduct();

}
