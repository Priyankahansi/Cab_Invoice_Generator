package com.bridgelabz;

import org.junit.Test;
import org.testng.Assert;

public class InvoiceServiceTest {
    @Test
    public void givenDistanceAndTimeShouldReturnFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(25, fare, 0.0);
    }
}





