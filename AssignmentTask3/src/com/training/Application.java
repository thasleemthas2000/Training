package com.training;

import com.training.model.Product;

public class Application {
	
	public static void main(String[] args) {
		Product productval1 = new Product(200, "Foundation", 500);
		Product productval2 = new Product(201, "Concealer", 350);
		Product productval3 = new Product(202, "Contour", 400);
		Product productval4 = new Product(203, "Compact", 800);
		Product productval5 = new Product(204, "Highlighter", 950);
		Product productval6 = new Product(205, "Lipstick", 1500);
		System.out.println(productval1.getProductId());
		System.out.println(productval2.getProductName());
		System.out.println(productval3.getRatePerUnit());
	}

}
//productval1.getProductName(), productval1.getRatePerUnit());