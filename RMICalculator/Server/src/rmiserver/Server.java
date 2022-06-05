/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiserver;

import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import rmiserver.Implements;

/**
 *
 * @author dimou
 */
public class Server {
    
    public static void main(String[] args) throws RemoteException,NotBoundException
    {
       
        try
        {
            //create registry and 
            //register rmi object with a name "Calculator"
            Registry registry = java.rmi.registry.LocateRegistry.createRegistry(999);
            registry.rebind("Calculator", new Implements()); //bind implements
            System.out.println("Server is running");
        }
        catch(Exception e)
                {
                    System.out.println(e);
                }
    }
    
}
