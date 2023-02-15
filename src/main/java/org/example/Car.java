package org.example;

public class Car {
    private int minSpeed=0;
    private int maxSpeed=0;
    public Car(int minSpeed,int maxSpeed){
        this.maxSpeed=maxSpeed;
        this.minSpeed=minSpeed;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMinSpeed() {
        return minSpeed;
    }

    public void setMinSpeed(int minSpeed) {
        this.minSpeed = minSpeed;
    }
}
