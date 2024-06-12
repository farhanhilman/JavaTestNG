package com.juaracoding;

public class TaxSalary {


    public double calculateTaxSalary(double salary){
        return salary * 0.1;
    }

    public double totalSalary(double salary){
        return salary - calculateTaxSalary(salary);
    }


}
