package com.example.dependency.tax;

import org.springframework.stereotype.Component;

@Component

public class DeveloperTax implements Taxable{

    @Override
    public double getMiddleTaxRate() {
        return 0.30;
    }
    public double getSimpleTaxRate() {
        return 0.25;
    }
    public double getUpperTaxRate () {
        return 0.35;
    }
}
