/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Mariam
 */
public class MedicineFacade extends UnicastRemoteObject implements MedicineFacadeInterface{

    Medicine m;
//        public CourseFacade() throws RemoteException {
//        c= new Course("", "", "");
//    }
    
    
    
    @Override
    public void SetMedicineData(String name, String type, String expiredDate, int amountInStock, int price) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMedicineData() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
