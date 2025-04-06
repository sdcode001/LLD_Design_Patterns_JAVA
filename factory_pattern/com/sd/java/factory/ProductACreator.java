package com.sd.java.factory;

import com.sd.java.entity.Product;
import com.sd.java.entity.ProductA;

public class ProductACreator extends ProductCreator {

	@Override
	public Product createProduct() {
		Product product = new ProductA();
		return product;
	}

}
