package com.ijh165.finalpractice.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Fibonacci extends UnicastRemoteObject implements FibInterface {
    public Fibonacci() throws RemoteException {
        super();
    }

	@Override
    public int compute(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return compute(n-1) + compute(n-2);
    }
}