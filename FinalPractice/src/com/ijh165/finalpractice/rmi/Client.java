package com.ijh165.finalpractice.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String args[]) {
        try {
            Registry reg = LocateRegistry.getRegistry("127.0.0.1",1099);
            FibInterface i = (FibInterface) reg.lookup("remote Fibonacci object");
            int n = 20;
            System.out.println("fibonacci(" + n + ") = " + i.compute(n));
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
}