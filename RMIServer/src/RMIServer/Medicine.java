/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIServer;

import RMI.MedicineInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;

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
    
    private MongoClient client;
    private MongoDatabase database;
    private MongoCollection<Document> collection;
    private Gson gson = new Gson();
    
    public Medicine() throws RemoteException{
        // Disables Mongo Logs
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        // Initialize
        client = new MongoClient();
        database = client.getDatabase("MedicalHealthCare"); // Database name
        collection = database.getCollection("Medicine"); // Collection name
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
    
    @Override
    public void postMedicine(String name, String type, String expiredDate, int amountInStock, int price) throws RemoteException{
        Medicine newMedicineObject = new Medicine(name,type,expiredDate,amountInStock,price);
        collection.insertOne(Document.parse(gson.toJson(newMedicineObject)));
        System.out.println("Medicine Posted!.");
    }
    
    @Override
    public void deleteMedicine(String name) throws RemoteException{
        collection.deleteOne(Filters.eq("name", name));
    }
    
    @Override
    public void editMedicine(String name) throws RemoteException{
        
    }

    @Override
    public void orderMedicine(String name) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
