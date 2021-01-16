/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIServer;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;

/**
 *
 * @author meriam
 */
public class DB {
    
   public static MongoClient mongoClient;
    
   public static MongoDatabase database;
    
   MongoCollection<Document> collection1;
   MongoCollection<Document> collection2;
   MongoCollection<Document> collection3;
   MongoCollection<Document> collection4;
   MongoCollection<Document> collection5;
   MongoCollection<Document> collection6;
   MongoCollection<Document> collection7;
   MongoCollection<Document> collection8;
   MongoCollection<Document> collection9;
   MongoCollection<Document> collection10;
   MongoCollection<Document> collection11;
   MongoCollection<Document> collection12;
   MongoCollection<Document> collection13;
   MongoCollection<Document> collection14;
   MongoCollection<Document> collection15;
   MongoCollection<Document> collection16;
    
     public static Gson gson = new Gson();
    
    
     public DB() 
    {
        // Disables Mongo Logs
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        // Initialize
        mongoClient = new MongoClient();
        // Database name
        database = mongoClient.getDatabase("MedicalHealthCare"); 
        // Collection for the doctor 
        collection1 = database.getCollection("Doctor"); 
        //Collection for the Patient
        collection2 = database.getCollection("Patient"); 
        //Collection for the Nurse
        collection3 = database.getCollection("Nurse"); 
         //Collection for the Admin
        collection4 = database.getCollection("Admin");
        //Collection for the Account
        collection5 = database.getCollection("Account"); 
        //Collection for the Appointment
        collection6 = database.getCollection("Appointment");
        //Collection for the Inventory
        collection7 = database.getCollection("Inventory"); 
        //Collection for the MedicalProfile
        collection8 = database.getCollection("MedicalProfile"); 
        //Collection for the Medicine
        collection9 = database.getCollection("Medicine"); 
        //Collection for the Operation Room
        collection10 = database.getCollection("OperationRoom");
        //Collection for the OrderMedicine
        collection11 = database.getCollection("OrderMedicine"); 
        //Collection for the Payment
        collection12 = database.getCollection("Payment"); 
        //Collection for the Pharmacist
        collection13 = database.getCollection("Pharmacist"); 
        //Collection for the Prescription
        collection14 = database.getCollection("Prescription");
        //Collection for the Specializtion
        collection15 = database.getCollection("Specialization"); 
      
    }
     
      public void insertDoctor(Doctor d) 
    {
        collection1.insertOne(Document.parse(gson.toJson(d)));
        System.out.println("Doctor is inserted.");
    }
        
      public void insertPatient(Patient p) 
    {
        collection2.insertOne(Document.parse(gson.toJson(p)));
        System.out.println("Patient is inserted.");
    } 
    
    
    public void insertNurse(Nurse n) 
    {
        collection3.insertOne(Document.parse(gson.toJson(n)));
        System.out.println("Nurse is inserted.");
    } 
    
    public void insertAdmin(Admin a) 
    {
        collection4.insertOne(Document.parse(gson.toJson(a)));
        System.out.println("Admin is inserted.");
    } 
    
    
    public void insertAccount(Account a) 
    {
        collection5.insertOne(Document.parse(gson.toJson(a)));
        System.out.println("Account is inserted.");
    } 
    
     public void insertAppointment(Appointment a) 
    {
        collection6.insertOne(Document.parse(gson.toJson(a)));
        System.out.println("Appointment is inserted.");
    } 
     
     public void insertInventory(Inventory i) 
    {
        collection7.insertOne(Document.parse(gson.toJson(i)));
        System.out.println("Inventory is inserted.");
    } 
     
     public void insertMedicalProfile(MedicalProfile m) 
    {
        collection8.insertOne(Document.parse(gson.toJson(m)));
        System.out.println("MedicalProfile is inserted.");
    }
     
     public void insertMedicine(Medicine m) 
    {
        collection9.insertOne(Document.parse(gson.toJson(m)));
        System.out.println("Medicine is inserted.");
    } 
     
     public void insertOperationRoom(OperationRoom o) 
    {
        collection10.insertOne(Document.parse(gson.toJson(o)));
        System.out.println("OperationRoom is inserted.");
    } 
    
     public void insertOrderMedicine(OrderMedicine o) 
    {
        collection11.insertOne(Document.parse(gson.toJson(o)));
        System.out.println("OrderMedicine is inserted.");
    }
      
      public void insertPayment(Payment p) 
    {
        collection12.insertOne(Document.parse(gson.toJson(p)));
        System.out.println("Payment is inserted.");
    } 
      
      public void insertPharmacist(Pharmacist p) 
    {
        collection13.insertOne(Document.parse(gson.toJson(p)));
        System.out.println("Pharmacist is inserted.");
    }
      
      public void insertPrescription(Prescription p) 
    {
        collection14.insertOne(Document.parse(gson.toJson(p)));
        System.out.println("Prescription is inserted.");
    }
      public void insertSpecialization(Specialization s) 
    {
        collection15.insertOne(Document.parse(gson.toJson(s)));
        System.out.println("Specialization is inserted.");
    }
      
      //        public Student getStudentByMail(String email) {
//        Document doc = collection.find(Filters.eq("email", email)).first();
//        Student result = gson.fromJson(doc.toJson(), Student.class);
//        return result;
//    }
        public void RequestOperationRoom(int id, char type,String DrName)throws RemoteException{
                OperationRoom r = new OperationRoom(id,type);
                                  System.out.println("debug1");

                 // Doctor theDoctor = Doctor.getDrByName(DrName);
                    Document doc = collection1.find(Filters.eq("name", DrName)).first();
                                                      System.out.println(doc);

                    Doctor theDoctor = gson.fromJson(doc.toJson(), Doctor.class);
                                                      System.out.println("debug3");

                                    
                theDoctor.addOPR(r);
                                  System.out.println("debug4");

                            
                  Document UpdatedDoc =Document.parse(gson.toJson(theDoctor));
                  System.out.println("debug5");

                collection1.replaceOne(Filters.eq("name", DrName), UpdatedDoc);
                                   System.out.println("debug6");
             

    }
       public void close() 
    {
        mongoClient.close();
    }
}
