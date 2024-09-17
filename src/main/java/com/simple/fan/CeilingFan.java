package com.simple.fan;

import com.simple.fan.state.FanState;
import com.simple.fan.state.OffState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CeilingFan {
    private static final Logger logger = LoggerFactory.getLogger(CeilingFan.class);

    private FanState currentState;
    private boolean isReversed;

    public CeilingFan() {
        this.currentState = new OffState();
        this.isReversed = false;
    }

    public void pullSpeedCord() {
        currentState.pullSpeedCord(this);
    }

    public void pullDirectionCord() {
        currentState.pullDirectionCord(this);
    }

    public void setCurrentState(FanState newState) {
        this.currentState = newState;
    }

    public void reverseDirection() {
        isReversed = !isReversed;
    }

    public boolean isReversed() {
        return isReversed;
    }

    public int getCurrentSpeed() {
        return this.currentState.getSpeed();
    }

    public void displayState() {
        logger.info("Fan is running at speed {}, in {} direction.", currentState, (isReversed ? "Reversed" : "Normal"));
    }
}
