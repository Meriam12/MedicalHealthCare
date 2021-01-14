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
            //Calling the class for the database 
            DB db = new DB();
        
            Inventory Inv = new Inventory();
            Medicine med1 =  new Medicine("fucidine","cream","23/10/2022",100,25);
            Medicine med2 =  new Medicine("fucicort","cream","23/10/2023",150,30);
            
            db.insertMedicine(med1);
            db.insertMedicine(med2);
             
            Inv.addMedicine(med1);
            Inv.addMedicine(med2);

            db.insertInventory(Inv);
            
            Patient p1 = new Patient("25673","234-456-329","167 Masr el gedida","Hossam Amr","012275767464","12/7/1960","Hossam23@yahoo.com");
            Patient p2 = new Patient("","908-543-094","90 El Giza","Amira Mostafa","01564545444","09/8/1970","Amira21@yahoo.com");
            
            db.insertPatient(p1);
            db.insertPatient(p2);
            
            Appointment a1 = new Appointment("1/2/2021 Monday at 9 am");
            Appointment a2 = new Appointment("12/2/2021 tusday at 1 pm");
            
            db.insertAppointment(a1);
            db.insertAppointment(a2);
            
            
         
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
