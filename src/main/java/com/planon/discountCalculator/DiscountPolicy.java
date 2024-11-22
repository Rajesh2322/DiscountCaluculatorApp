package com.planon.discountCalculator;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import com.planon.discountCalculator.model.Product;
import com.planon.discountCalculator.model.ProductType;

public class DiscountPolicy {
	
	public static double calculateDiscount(Product product) {
        long daysToExpiry = ChronoUnit.DAYS.between(LocalDate.now(), product.getExpiryDate());
        double discountPercentage = 0.0;

        if (product.getType() == ProductType.NON_PERISHABLE) {
            if (daysToExpiry <= 15) discountPercentage = 50;
            else if (daysToExpiry <= 30) discountPercentage = 30;
            else if (daysToExpiry <= 60) discountPercentage = 20;
            else if (daysToExpiry <= 90) discountPercentage = 10;
        } else if (product.getType() == ProductType.PERISHABLE) {
            if (daysToExpiry <= 1) discountPercentage = 35;
            else if (daysToExpiry <= 2) discountPercentage = 25;
            else if (daysToExpiry <= 3) discountPercentage = 15;
        }

        return product.getPrice() * discountPercentage / 100;
    }

}
