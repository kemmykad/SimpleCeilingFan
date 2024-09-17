package com.simple.fan.state;

import com.simple.fan.CeilingFan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpeedOneState implements FanState{

    private static final Logger logger = LoggerFactory.getLogger(SpeedOneState.class);

    @Override
    public void pullSpeedCord(CeilingFan fan) {
        logger.info("Turning Fan to speed 2");
        fan.setCurrentState(new SpeedTwoState());
    }

    @Override
    public void pullDirectionCord(CeilingFan fan) {
        fan.reverseDirection();
        logger.info("Fan remain on speed 1, but direction is now " +  (fan.isReversed() ? "Reversed" : "Normal"));
    }

    @Override
    public int getSpeed() {
        return 1;
    }
}
