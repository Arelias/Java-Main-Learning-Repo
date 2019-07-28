package com.kodilla.patterns.singleton;

import org.junit.*;

public class LoggerTestSuite {

    static String currentLog = "A";

    @Before
    public void updateCurrentLog(){
        currentLog += "A";
    }

    @Test
    public void saveToLogEquals() {

        //When
        Logger.getInstance().log(currentLog);
        //Then
        Assert.assertEquals(currentLog, Logger.getInstance().getLastLog());
    }
    @Test
    public void saveToLogNotEquals() {

        //Then
        Assert.assertNotEquals(currentLog, Logger.getInstance().getLastLog());
    }
}