package com.simple.fan;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CeilingFanTest {

    private CeilingFan fan;

    @Before
    public void setUp() {
        fan = new CeilingFan();
    }

    @Test
    public void testInitialStateIsOff() {
        assertEquals(0, fan.getCurrentSpeed()); // Speed should be 0 (Off)
        assertFalse(fan.isReversed()); // Direction should be Normal
    }

    @Test
    public void testPullSpeedCordFromOffState() {
        fan.pullSpeedCord(); // Move from speed 0 to 1
        assertEquals(1, fan.getCurrentSpeed()); // Speed should be 1
        assertFalse(fan.isReversed()); // Direction should be Normal
    }

    @Test
    public void testPullSpeedCordFromSpeed1() {
        fan.pullSpeedCord(); // Move from speed 0 to 1
        fan.pullSpeedCord(); // Move from speed 1 to 2
        assertEquals(2, fan.getCurrentSpeed()); // Speed should be 2
        assertFalse(fan.isReversed()); // Direction should be Normal
    }

    @Test
    public void testPullSpeedCordFromSpeed2() {
        fan.pullSpeedCord(); // Move from speed 0 to 1
        fan.pullSpeedCord(); // Move from speed 1 to 2
        fan.pullSpeedCord(); // Move from speed 2 to 3
        assertEquals(3, fan.getCurrentSpeed()); // Speed should be 3
        assertFalse(fan.isReversed()); // Direction should be Normal
    }

    @Test
    public void testPullSpeedCordFromSpeed3() {
        fan.pullSpeedCord(); // Move from speed 0 to 1
        fan.pullSpeedCord(); // Move from speed 1 to 2
        fan.pullSpeedCord(); // Move from speed 2 to 3
        fan.pullSpeedCord(); // Move from speed 3 to off
        assertEquals(0, fan.getCurrentSpeed()); // Speed should be 0 (Off)
        assertFalse(fan.isReversed()); // Direction should be Normal
    }

    @Test
    public void testPullDirectionCordFromOffState() {
        fan.pullDirectionCord();
        assertEquals(0, fan.getCurrentSpeed()); // Speed should be 0 (Off)
        assertTrue(fan.isReversed()); // Direction should be reversed
    }

    @Test
    public void testPullDirectionCordFromSpeed1() {
        fan.pullSpeedCord(); // Move from speed 0 to 1
        fan.pullDirectionCord();
        assertEquals(1, fan.getCurrentSpeed());  // Speed should be 1
        assertTrue(fan.isReversed()); // Direction should be reversed
    }

    @Test
    public void testDirectionToggle() {
        fan.pullSpeedCord(); // Move from speed 0 to 1
        fan.pullDirectionCord(); // Reverse direction
        assertTrue(fan.isReversed()); // Direction should be reversed

        fan.pullDirectionCord(); // Toggle direction
        assertFalse(fan.isReversed()); // Direction should be normal
    }

    @Test
    public void testCompleteCycle() {
        fan.pullSpeedCord(); // Speed 1
        fan.pullSpeedCord(); // Speed 2
        fan.pullSpeedCord(); // Speed 3
        fan.pullSpeedCord(); // Off

        assertEquals(0, fan.getCurrentSpeed()); // Speed should be 0 (Off)
        fan.pullDirectionCord(); // Reverse direction
        assertTrue(fan.isReversed()); // Direction should be reversed
    }
}
