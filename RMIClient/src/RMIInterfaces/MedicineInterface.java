/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIInterfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author Mariam
 */
public interface MedicineInterface extends Remote {
    
        public void postMedicine(String name, String type, String expiredDate, int amountInStock, int price) throws RemoteException;
    
        public void deleteMedicine(String name) throws RemoteException;

        public void editMedicine(String name) throws RemoteException;
}