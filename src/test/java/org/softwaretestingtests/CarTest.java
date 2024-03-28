package org.softwaretestingtests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

import org.softwaretesting.Car;

public class CarTest {

    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car();
    }

    @Test
    void testAccelerateWhenStationary() {
        String result = car.accelerate(Car.CarState.STATIONARY);
        Assertions.assertEquals("Car is accelerating", result);
    }

    @Test
    void testAccelerateWhenMoving() {
        // First, set the car to a moving state
        car.accelerate(Car.CarState.STATIONARY);
        String result = car.accelerate(Car.CarState.ACCELERATING);
        Assertions.assertEquals("Car is already accelerating", result);
    }

    @Test
    void testBrakeWhenMoving() {
        // Set the car to a moving state before braking
        car.accelerate(Car.CarState.STATIONARY);
        String result = car.brake(Car.CarState.ACCELERATING);
        Assertions.assertEquals("Car is braking to a stop", result);
    }

    @Test
    void testBrakeWhenStationary() {
        String result = car.brake(Car.CarState.STATIONARY);
        Assertions.assertEquals("Can't brake as car is stationary", result);
    }

    @Test
    void testTurnRightWhenMoving() {
        // Set the car to a moving state
        car.accelerate(Car.CarState.STATIONARY);
        String result = car.turnRight(Car.CarState.ACCELERATING);
        Assertions.assertEquals("Car is turning right", result);
    }

    @Test
    void testTurnRightWhenStationary() {
        String result = car.turnRight(Car.CarState.STATIONARY);
        Assertions.assertEquals("Can't turn right as car is stationary", result);
    }

    @Test
    void testTurnLeftWhenMoving() {
        // Set the car to a moving state
        car.accelerate(Car.CarState.STATIONARY);
        String result = car.turnLeft(Car.CarState.ACCELERATING);
        Assertions.assertEquals("Car is turning left", result);
    }

    @Test
    void testTurnLeftWhenStationary() {
        String result = car.turnLeft(Car.CarState.STATIONARY);
        Assertions.assertEquals("Can't turn left as car is stationary", result);
    }
}
