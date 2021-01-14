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
            Medicine med3 = new Medicine("Meglitinides","Tablets","22/10/2023",95,35);
            
            db.insertMedicine(med1);
            db.insertMedicine(med2);
            db.insertMedicine(med3);
            
            Inv.addMedicine(med1);
            Inv.addMedicine(med2);
            Inv.addMedicine(med3);
            
            db.insertInventory(Inv);
            
            Account acc1=new Account("Hossam","1234","Patient");
            Account acc2 = new Account("Amira","0987","Patient");
            
            db.insertAccount(acc1);
            db.insertAccount(acc2);
            
            Prescription pres1=new Prescription();
            Prescription pres2=new Prescription();
            
            pres1.adddPresciption("You should take this medicine for 1 month, after each meal and then come to meet agin the doctor");
            pres2.adddPresciption("You should take this medicine for 2 weeks, amorning and night before sleeping and then come to meet agin the doctor");
            
            db.insertPrescription(pres1);
            db.insertPrescription(pres2);
                    
            Patient p1 = new Patient("25673","234-456-329","167 Masr el gedida","Hossam Amr","012275767464","12/7/1960","Hossam23@yahoo.com");
            Patient p2 = new Patient("","908-543-094","90 El Giza","Amira Mostafa","01564545444","09/8/1970","Amira21@yahoo.com");
           
            Appointment a1 = new Appointment("1/2/2019 Monday at 9 am");
            Appointment a2 = new Appointment("12/2/2021 tusday at 1 pm");
            Appointment a3 = new Appointment("20/1/2021 Saturday at 11 am");
            Appointment a4 = new Appointment("21/4/2018a Sunday at 8 pm");
            
            MedicalProfile prof1= new MedicalProfile("A+");
            MedicalProfile prof2= new MedicalProfile("AB+");
            
            prof1.addChronicDiseases("Diabetes");
            prof1.addMedicines(med3);
            prof1.addPastAppointments(a1);
           prof1.addPrescription(pres1);
           // prof1.adddFollowup(doctorName);
            
            prof2.addChronicDiseases("");
            prof2.addMedicines(med2);
            prof2.addPastAppointments(a4);
            prof2.addPrescription(pres2);
          //  prof2.adddFollowup(doctorName);
            
            
            
            
            Payment pay1= new Payment("Visa");
            Payment pay2= new Payment("Cash");
            db.insertPayment(pay1);
            db.insertPayment(pay2);
            
            a1.addPayment(pay1);
            a3.addPayment(pay1);
            a2.addPayment(pay2);
            a4.addPayment(pay2);
           
            db.insertAppointment(a1);
            db.insertAppointment(a2);
            db.insertAppointment(a3);
            db.insertAppointment(a4);
            
            p1.addAppointments(a2);
      
            p2.addAppointments(a3);
            
            OrderMedicine o1= new OrderMedicine(1, "Arrived");
            
            o1.addOrder(med2);
            o1.addPayment(pay2);
            
            db.insertOrderMedicine(o1);
            
            p1.addOrder(o1);
            p1.addAccount(acc1);
            p1.addMedicalProfile(prof1);
            
            p2.addMedicalProfile(prof2);
            p2.addAccount(acc2);
           
            
            db.insertPatient(p1);
            db.insertPatient(p2);
            
            
            
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
