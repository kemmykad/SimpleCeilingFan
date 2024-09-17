package com.simple.fan.state;

import com.simple.fan.CeilingFan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpeedTwoState implements FanState{

    private static final Logger logger = LoggerFactory.getLogger(SpeedTwoState.class);

    @Override
    public void pullSpeedCord(CeilingFan fan) {
        logger.info("Turning Fan to speed 3");
        fan.setCurrentState(new SpeedThreeState());
    }

    @Override
    public void pullDirectionCord(CeilingFan fan) {
        fan.reverseDirection();
        logger.info("Fan remain on speed 2, but direction is now " +  (fan.isReversed() ? "Reversed" : "Normal"));
    }

    @Override
    public int getSpeed() {
        return 2;
    }
}
