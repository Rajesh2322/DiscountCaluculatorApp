package com.planon.discount_calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.planon.discountCalculator.DiscountPolicy;
import com.planon.discountCalculator.model.Product;
import com.planon.discountCalculator.model.ProductType;


public class DiscountCalculatorTest  {
	
	@Test
    public void testCalculateDiscountForNonPerishable() {
        Product rice = new Product("Rice", ProductType.NON_PERISHABLE, 500, LocalDate.now().plusDays(30));
        double discount = DiscountPolicy.calculateDiscount(rice);
        assertEquals(150, discount, 0.01);
    }

    @Test
    public void testCalculateDiscountForPerishable() {
        Product milk = new Product("Milk", ProductType.PERISHABLE, 50, LocalDate.now().plusDays(1));
        double discount = DiscountPolicy.calculateDiscount(milk);
        assertEquals(17.5, discount, 0.01);
    }
	
}
