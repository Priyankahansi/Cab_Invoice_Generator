package com.bridgelabz;

import org.junit.Test;

public class Ride {
    public final double distance;
    public final int time;
    public Ride(double distance, int time) {
        this.distance=distance;
        this.time=time;
    }

}

    public double calculateFare(double distance, int time) {
        double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
        if (totalFare < MINIMUM_FARE) {
            return MINIMUM_FARE;

        } else {
            return totalFare;
        }
    }

    public double calculateFare(Ride[] rides) {
        double totalFare =0;
        for (Ride ride:rides) {
            totalFare=this.calculateFare(ride.distance,ride.time);
        }
        return totalFare;
    }
}

private static final double MINIMUM_FARE = 5;
        }
@Test
public void givenLessDistanceAndTimeShouldReturnMinFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(5, fare, 0.0);
        }

@Test
public void givenMultipleRidesShouldReturnTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Ride[] rides = {new Ride(2.0, 5),
        new Ride(0.1, 1)
        };
        double fare = invoiceGenerator.calculateFare(rides);
        Assert.assertEquals(30, fare, 0.0);
        }





        return totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;