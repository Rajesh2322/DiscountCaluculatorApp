package com.planon.discountCalculator;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.planon.discountCalculator.model.Product;
import com.planon.discountCalculator.model.ProductType;



public class DiscountCalculatorApp 
{
    public static void main( String[] args )
    {
    	 List<Product> products = Arrays.asList(
                 new Product("Milk", ProductType.PERISHABLE, 50, LocalDate.now().plusDays(2)),
                 new Product("Rice", ProductType.NON_PERISHABLE, 500, LocalDate.now().plusDays(60)),
                 new Product("Vegetables", ProductType.PERISHABLE, 30, LocalDate.now().plusDays(1)),
                 new Product("Salt", ProductType.NON_PERISHABLE, 20, LocalDate.now().plusDays(10))
         );

         DiscountCalculator.calculateAndPrintDiscounts(products);
    }
}
