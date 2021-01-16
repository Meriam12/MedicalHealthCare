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
import RMI.OperationRoomInterface;
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

public class OperationRoom  extends UnicastRemoteObject implements OperationRoomInterface{
    private int ID;
    private char Type;
    private Doctor ReservedDoctor; 

    DB db;
    public OperationRoom()throws RemoteException{
                // Disables Mongo Logs
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        // Initialize
       db = new DB();
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
    
//        public Student getStudentByMail(String email) {
//        Document doc = collection.find(Filters.eq("email", email)).first();
//        Student result = gson.fromJson(doc.toJson(), Student.class);
//        return result;
//    }


    
    @Override
    public String RequestOperationRoom(int id, char type,String DRmail)throws RemoteException{
               
        Document ORdoc = db.collection10.find(Filters.eq("ID", id)).first();
                //System.out.println(ORdoc);
        OperationRoom result =    db.gson.fromJson(ORdoc.toJson(), OperationRoom.class);
               // System.out.println(result);
               
         Document doc = db.collection1.find(Filters.eq("email", DRmail)).first();
               // System.out.println(doc);
        Doctor DRresult =    db.gson.fromJson(doc.toJson(), Doctor.class);
               // System.out.println(DRresult);
               
               
               
         result.ReservedDoctor =  DRresult;
         
         Document UpdatedRoom =Document.parse(db.gson.toJson(result));
         
          db.collection10.replaceOne(Filters.eq("ID", id), UpdatedRoom);
          
          //return "Room with id " + id + " and type " +  type + " is requested by doctor whose email is " + DRmail;
          return "Room is requested successfully";
                
             //       Document doc = db.collection1.find(Filters.eq("name", DrName)).first();
           //                                           System.out.println(doc);

                //    Doctor theDoctor = db.gson.fromJson(doc.toJson(), Doctor.class);
                   //                                   System.out.println(theDoctor);
  
                            
//                  Document UpdatedDoc =Document.parse(db.gson.toJson(theDoctor));
//                  System.out.println("debug5");
//
//                 db.collection1.replaceOne(Filters.eq("name", DrName), UpdatedDoc);
//                                   System.out.println("debug6");

                       

    }
    
       public void addDoctor(Doctor d)throws RemoteException
    {
       this.ReservedDoctor=d ;
    }
    
}