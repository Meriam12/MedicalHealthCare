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
 * @author meriam
 */
public class Medicine extends UnicastRemoteObject implements MedicineInterface{
    private String name;
    private String type;
    private String expiredDate;
    private int amountInStock;
    private int price;
    
    public Medicine() throws RemoteException{
        
    }

    public Medicine(String name, String type, String expiredDate, int amountInStock, int price)  throws RemoteException  {
        this.name = name;
        this.type = type;
        this.expiredDate = expiredDate;
        this.amountInStock = amountInStock;
        this.price = price;
    }

    public String getName() throws RemoteException{
        return name;
    }

    public void setName(String name)  throws RemoteException{
        this.name = name;
    }

    public String getType() throws RemoteException{
        return type;
    }

    public void setType(String type) throws RemoteException {
        this.type = type;
    }

    public String getExpiredDate() throws RemoteException{
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) throws RemoteException {
        this.expiredDate = expiredDate;
    }

    public int getAmountInStock() throws RemoteException{
        return amountInStock;
    }

    public void setAmountInStock(int amountInStock) throws RemoteException{
        this.amountInStock = amountInStock;
    }

    public int getPrice() throws RemoteException{
        return price;
    }

    public void setPrice(int price) throws RemoteException{
        this.price = price;
    }
    
    public void postMedicine(String name, String type, String expiredDate, int amountInStock, int price) throws RemoteException{
        
    }
    
    public void deleteMedicine(String name) throws RemoteException{
        
    }
    
    public void editMedicine(String name) throws RemoteException{
        
    }

}
