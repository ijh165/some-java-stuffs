package com.ijh165.finalpractice.forkjoin.fibonacci;

import com.ijh165.finalpractice.forkjoin.util.Timer;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinWorker {

    public static void main(String[] args) {

        // Check the number of available processors
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println("No of processors: " + processors);

        int n = 20;

        Timer timer = new Timer();

        timer.reset();
        timer.start();

        FibonacciProblem bigProblem = new FibonacciProblem(n);

        FibonacciTask task = new FibonacciTask(bigProblem);
        ForkJoinPool pool = new ForkJoinPool(processors);
        pool.invoke(task);

        long result = task.result;
        System.out.println("Computed Result: " + result);

        timer.stop();

        try {
            System.out.println("Elapsed Time: " + timer.getRecordedTimeInNanoSec()/1000000.0 + " ms");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}