package com.ijh165.finalpractice.forkjoin.power;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinWorker {

    public static void main(String[] args) {
        //compute 2^10 using fork join pattern
        PowerProblem bigProblem = new PowerProblem(2, 10);
        PowerTask task = new PowerTask(bigProblem);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(task);
        //print the result
        System.out.println("Result: " + task.getResult());
    }
}