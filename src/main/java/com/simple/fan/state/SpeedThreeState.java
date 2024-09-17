package com.simple.fan.state;

import com.simple.fan.CeilingFan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpeedThreeState implements FanState{

    private static final Logger logger = LoggerFactory.getLogger(SpeedThreeState.class);

    @Override
    public void pullSpeedCord(CeilingFan fan) {
        logger.info("Turning Fan off");
        fan.setCurrentState(new OffState());
    }

    @Override
    public void pullDirectionCord(CeilingFan fan) {
        fan.reverseDirection();
        logger.info("Fan remain on speed 3, but direction is now " +  (fan.isReversed() ? "Reversed" : "Normal"));
    }

    @Override
    public int getSpeed() {
        return 3;
    }
}
