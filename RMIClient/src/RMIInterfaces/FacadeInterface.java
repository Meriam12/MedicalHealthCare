/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIInterfaces;

import RMI.MedicineDTO;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Mariam
 */
public interface FacadeInterface {
       public void SetMedicineData(String name, String type, String expiredDate, int amountInStock, int price);
       public String getMedicineData();
       public MedicineDTO getMedicine() throws RemoteException;

}
