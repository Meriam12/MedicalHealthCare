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
             //public Patient(ArrayList<Appointment> comingAppointments, MedicalProfile medicalProfile, String medicalInsurance, String creditCardNumber, String address, ArrayList<OrderMedicine> ordeMedicine, String name, String phonenumber, String birthdate, String email) {
            Patient p = new Patient();
            
            
            
            
            
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
