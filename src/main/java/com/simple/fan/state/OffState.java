package com.simple.fan.state;

import com.simple.fan.CeilingFan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OffState implements FanState{
    private static final Logger logger = LoggerFactory.getLogger(OffState.class);
    @Override
    public void pullSpeedCord(CeilingFan fan) {
        logger.info("Turning fan to speed 1");
        fan.setCurrentState(new SpeedOneState());
    }

    @Override
    public void pullDirectionCord(CeilingFan fan) {
        fan.reverseDirection();
        logger.info("Fan remains off, but direction is now " + (fan.isReversed() ? "Reversed" : "Normal"));
    }

    @Override
    public int getSpeed() {
        return 0;
    }
}
