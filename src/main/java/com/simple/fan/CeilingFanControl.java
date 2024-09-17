package com.simple.fan;

public class CeilingFanControl {

    public static void main(String[] args) {
        CeilingFan fan = new CeilingFan();
        fan.pullSpeedCord(); // Speed 1
        fan.pullSpeedCord(); // Speed 2
        fan.pullDirectionCord(); // Reverse direction
        fan.pullSpeedCord(); // Speed 3
        fan.pullSpeedCord(); // Off
        fan.pullDirectionCord(); // Fan remain off but in reverse direction
    }
}
