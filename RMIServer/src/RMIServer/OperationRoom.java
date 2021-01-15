/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIServer;

/**
 *
 * @author meriam
 */
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

public class OperationRoom  extends UnicastRemoteObject {
    private int ID;
    private char Type;
    private Doctor ReservedDoctor; 

    DB db = new DB();
    public OperationRoom()throws RemoteException{
                // Disables Mongo Logs
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        // Initialize
       db.mongoClient = new MongoClient();
        db.database = db.mongoClient.getDatabase("MedicalHealthCare"); // Database name
    }
    
    
  public OperationRoom(int ID, char Type)  throws RemoteException{
        this.ID = ID;
        this.Type = Type;
    }

    public OperationRoom(int ID, char Type, Doctor ReservedDoctor) throws RemoteException {
        this.ID = ID;
        this.Type = Type;
        this.ReservedDoctor = ReservedDoctor;
    }

    public int getID() throws RemoteException{
        return ID;
    }

    public void setID(int ID)throws RemoteException {
        this.ID = ID;
    }

    public char getType() throws RemoteException{
        return Type;
    }

    public void setType(char Type) throws RemoteException{
        this.Type = Type;
    }

    public Doctor getReservedDoctor()throws RemoteException {
        return ReservedDoctor;
    }

    public void setReservedDoctor(Doctor ReservedDoctor)throws RemoteException {
        this.ReservedDoctor = ReservedDoctor;
    }
    
    public void RequestOperationRoom(int id, char type,String DrName)throws RemoteException{
                Document doc = db.collection1.find(Filters.eq("name", DrName)).first();
                Doctor theDoctor = db.gson.fromJson(doc.toJson(), Doctor.class);
    }
    
       public void addDoctor(Doctor d)throws RemoteException
    {
       this.ReservedDoctor=d ;
    }
    
}