package com.ijh165.finalpractice.forkjoin.util;

public class Timer
{
    //exception msg constants
    private static final String NEG_TIMING_ERR = "stopTimeInNanoSec - startTimeInNanoSec is negative!";

    //attributes
    private long startTimeInNanoSec;
    private long stopTimeInNanoSec;
    private boolean stopped;

    //constructor
    public Timer()
    {
        startTimeInNanoSec = stopTimeInNanoSec = 0;
        stopped = false;
    }

    //start
    public void start()
    {
        startTimeInNanoSec = System.nanoTime();
        stopped = false;
    }

    //stop
    public void stop()
    {
        if(!stopped) {
            stopTimeInNanoSec = System.nanoTime();
            stopped = true;
        }
    }

    //reset
    public void reset()
    {
        startTimeInNanoSec = stopTimeInNanoSec = 0;
        stopped = false;
    }

    //getters
    public long getRecordedTimeInNanoSec() throws Exception
    {
        if(startTimeInNanoSec > stopTimeInNanoSec) {
            throw new Exception(NEG_TIMING_ERR);
        }
        return stopTimeInNanoSec - startTimeInNanoSec;
    }
}