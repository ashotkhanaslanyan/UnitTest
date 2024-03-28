package org.softwaretesting;

public class Car {
    public enum CarState {
        STATIONARY, MOVING, ACCELERATING
    }

    private CarState currentState;

    public Car() {
        this.currentState = CarState.STATIONARY;
    }

    public String accelerate(CarState state) {
        if (state == CarState.STATIONARY) {
            currentState = CarState.ACCELERATING;
            return "Car is accelerating";
        } else {
            return "Car is already accelerating";
        }
    }

    public String brake(CarState state) {
        if (state == CarState.MOVING || state == CarState.ACCELERATING) {
            currentState = CarState.STATIONARY;
            return "Car is braking to a stop";
        } else {
            return "Can't brake as car is stationary";
        }
    }

    public String turnRight(CarState state) {
        if (state == CarState.MOVING || state == CarState.ACCELERATING) {
            return "Car is turning right";
        } else {
            return "Can't turn right as car is stationary";
        }
    }

    public String turnLeft(CarState state) {
        if (state == CarState.MOVING || state == CarState.ACCELERATING) {
            return "Car is turning left";
        } else {
            return "Can't turn left as car is stationary";
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car();
    }
}
