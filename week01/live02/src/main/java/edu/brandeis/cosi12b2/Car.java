package edu.brandeis.cosi12b2;

public class Car {
    private static final float KILOMETER_PER_MILE = 1.60934f;
    private final float mileage;

    public Car(float mileage) {
        this.mileage = mileage;
    }

    public float getOdometerMiles() {
        return mileage;
    }
}
