/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Toumie
 */
public interface AdminInterface extends Remote{
    
    void createAccount(String username, String pass) throws RemoteException;
    void deleteAccount(String username) throws RemoteException;
    void updateAccount(String username, String pass) throws RemoteException;
    
}
