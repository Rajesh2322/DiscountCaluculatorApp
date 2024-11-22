package com.planon.discountCalculator;

import java.util.List;

import com.planon.discountCalculator.model.Product;

public class DiscountCalculator {
	
	public static void calculateAndPrintDiscounts(List<Product> products) {
        products.forEach(product -> {
            double discount = DiscountPolicy.calculateDiscount(product);
            System.out.printf("Product: %s, Original Price: %.2f, Discount: %.2f, Final Price: %.2f%n",
                    product.getName(),
                    product.getPrice(),
                    discount,
                    product.getPrice() - discount
            );
        });
    }

}
