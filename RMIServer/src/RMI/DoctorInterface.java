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
 * @author Mariam
 */
public interface DoctorInterface extends Remote{
      
    
    public void makeRating(int rating, String name) throws RemoteException;
   
    public void viewDoctor(String name) throws RemoteException;
    
    public void editDRProfile(String name, String levelOfExpertise,  String phonenumber, String email) throws RemoteException;
    
}
