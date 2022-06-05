/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiserver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import rmicalculator.Interface;
import rmicalculator.Interface;

/**
 *
 * @author dimou
 */
public class Implements extends UnicastRemoteObject implements Interface{
    //Provide an implementation for each remote method in the interface
    public Implements() throws RemoteException
    {
        super();
        
    }
    @Override
    public int add(int a,int b) throws RemoteException
    {
        return a+b;
    }
    @Override
      public int sub(int a,int b) throws RemoteException
    {
        return a-b;
    }
    @Override
    public int mul(int a,int b) throws RemoteException
    {
        return a*b;
    }
    @Override
    public int div(int a,int b) throws RemoteException
    {
        return a/b;
    }
    
}
