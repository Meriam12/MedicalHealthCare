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
            
            Inventory Inv = new Inventory();
            Medicine med1 =  new Medicine("fucidine","cream","23/10/2022",100,25);
            Medicine med2 =  new Medicine("fucicort","cream","23/10/2023",150,30);
            Inv.addMedicine(med1);
            Inv.addMedicine(med2);

            db.insertInventory(Inv);
            
            
            
            
         
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
