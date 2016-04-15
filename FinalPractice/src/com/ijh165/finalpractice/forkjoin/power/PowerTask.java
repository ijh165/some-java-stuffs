package com.ijh165.finalpractice.forkjoin.power;

import java.util.concurrent.RecursiveTask;

public class PowerTask extends RecursiveTask<Long> {

    private static final long serialVersionUID = 6136927121059165206L;

    private PowerProblem problem;

    private long result;

    public PowerTask(PowerProblem problem) {
        this.problem = problem;
    }

    public long getResult() {
        return result;
    }

    @Override
    protected Long compute() {
        if (problem.getI() == 0) {
            result = 1;
        }
        else if (problem.getI() == 1) {
            result = problem.getN();
        }
        else {
            PowerTask worker = new PowerTask(new PowerProblem(problem.getN(),problem.getI()-1));
            worker.fork();
            result = problem.getN() * worker.join();
        }
        return result;
    }
}