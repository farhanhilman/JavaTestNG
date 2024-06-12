package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EmployeeTest {

    Employee employee;
    TaxSalary taxSalary;

    @BeforeClass
    public void setUp() {
        employee = new Employee();
        taxSalary = new TaxSalary();
        employee.setNama("farhan");
        employee.setAge(23);
        employee.setSalary(70000000);
    }

    @Test
    public void testEmployee() {
        String nameExpected = "farhan";
        int ageExpected = 23;
        double salaryExpected = 70000000;

        Assert.assertEquals(employee.getNama(), nameExpected);
        Assert.assertEquals(employee.getAge(), ageExpected);
        Assert.assertEquals(employee.getSalary(), salaryExpected);

    }

    @Test
    public void testCalculateTaxSalary() {
        double expected = 7000000;
        double actual = taxSalary.calculateTaxSalary(70000000);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testTotalSalary() {
        double expected = 63000000;
        double actual = taxSalary.totalSalary(employee.getSalary());
        Assert.assertEquals(actual, expected);
    }

}
