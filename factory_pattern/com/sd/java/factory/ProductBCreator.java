package com.sd.java.factory;

import com.sd.java.entity.Product;
import com.sd.java.entity.ProductB;

public class ProductBCreator extends ProductCreator{

	@Override
	public Product createProduct() {
		Product product = new ProductB();
		return product;
	}

}
