package com.ijh165.finalpractice.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FibInterface extends Remote {
    int compute(int n) throws RemoteException;
}