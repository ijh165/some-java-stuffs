package com.ijh165.finalpractice.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String args[]) {
        try {
            Registry reg = LocateRegistry.createRegistry(1099);
            Fibonacci inc = new Fibonacci();
            reg.rebind("remote Fibonacci object", inc);
            System.out.println("Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
}