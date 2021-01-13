/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author meriam
 */
public class RMIServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            
           // Disables Mongo Logs
           Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
           mongoLogger.setLevel(Level.SEVERE); 
           
           // Initialize the database
           MongoClient mongoClient = new MongoClient();
           
           //retrieve all Databases from MongoServer
           List <String> DBs = mongoClient.getDatabaseNames(); 
           System.out.print(DBs);
           
           MongoDatabase MedicalHealthCare= mongoClient.getDatabase("MedicalHealthCare");
           
           // Creating collations
           //MedicalHealthCare.createCollection("Doctor");
           
           
           // Getting the collections
           MongoCollection Doctor = MedicalHealthCare.getCollection("Doctor");
           
            //Document Doc1 = new Document ("Fname","Meriam").append("Lname","Sherif").append("Position","DR");
              
            Document Doc2 = new Document ("Fname","Marina").append("Lname","Hatem").append("Position","DR");
           // Doctor.insertOne(Doc1);   
           Doctor.insertOne(Doc2);   
            // My remote object [Skeleton]
            MedicineFacadeInterface facade = new MedicineFacade();
            
            // My RMI Registry
            Registry registry = LocateRegistry.createRegistry(1099);
            
            //Add my object to the RMI Registry
            registry.bind("fac", facade);
            System.out.println("My facade is ready...");   
        } catch (Exception ex) {
           System.out.println("Exception occured here ");
        }  
    }
    
}
