package com.simple.fan.state;

import com.simple.fan.CeilingFan;

public interface FanState {
    void pullSpeedCord(CeilingFan fan);
    void pullDirectionCord(CeilingFan fan);
    int getSpeed();
}
