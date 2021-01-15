/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIServer;

import RMI.MedicineInterface;
import RMI.MedicineFacadeInterface;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.rmi.AlreadyBoundException;
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
    
       static Nurse n1 ;
       static Nurse n2;
       static Inventory Inv;
       static Medicine med1;
       static Medicine med2;
       static Medicine med3;
       static  Account acc1;
       static  Account acc2;
       static  Account acc3;
       static  Account acc4;
       static  Account acc5;
       static  Account acc6;
       static  Account acc7;
       static  Account acc8;
       static Account acc9;
       static  Prescription pres1;
       static  Prescription pres2;
       static Patient p1;
       static Patient p2;
       static Appointment a1;
       static Appointment a2;
       static Appointment a3;
       static Appointment a4;
       static  Doctor doc1;
       static  Doctor doc2;       
       static  MedicalProfile prof1;
       static  MedicalProfile prof2;
       static  Payment pay1;
       static  Payment pay2;
       static  OrderMedicine o1;
       static  Pharmacist pharma1;
       static  Pharmacist pharma2;
       static  OperationRoom or1;
       static  OperationRoom or2;
       static  Admin ad;
       static  Specialization spe1;
       static Specialization spe2;
       
    public static void main(String[] args)   throws RemoteException, AlreadyBoundException{
        // TODO code application logic here

                
        
        try {
            //Calling the class for the database 
            DB db = new DB();
        
           
            
            Inv = new Inventory();
           
            med1 =  new Medicine("fucidine","cream","23/10/2022",100,25);
            med2 =  new Medicine("fucicort","cream","23/10/2023",150,30);
            med3 =  new Medicine("Meglitinides","Tablets","22/10/2023",95,35);
            
            db.insertMedicine(med1);
            db.insertMedicine(med2);
            db.insertMedicine(med3);
            
            Inv.addMedicine(med1);
            Inv.addMedicine(med2);
            Inv.addMedicine(med3);
            
            db.insertInventory(Inv);
            
            acc1 = new Account("Hossam","1234","Patient");
            acc2 = new Account("Amira","0987","Patient");
            acc3 = new Account("Marina","3456","Nurse");
            acc4 = new Account("Farid","1920","Nurse");
            acc5 = new Account("Farida","5678","Doctor");
            acc6 = new Account("Michael","1095","Doctor");
            acc7 = new Account("Mina","1945","Pharmacist");
            acc8 = new Account("Dalia","3645","Pharmacist");
            acc9 = new Account("Morad","3954","Admin");
           
            db.insertAccount(acc1);
            db.insertAccount(acc2);
            db.insertAccount(acc3);
            db.insertAccount(acc4);
            db.insertAccount(acc5);
            db.insertAccount(acc6);
            db.insertAccount(acc7);
            db.insertAccount(acc8);
            db.insertAccount(acc9);
            
            ad = Admin.getInstance();
            ad.addAccount(acc9);
            db.insertAdmin(ad);

            n1 = new Nurse("Dr. Farida Magdy","Marina Hany","0158908089","23/12/1990","MarinaH12@gmail.com");
            n2= new Nurse("Dr.Michael Samy","Farid Essam","0121909889","1/12/1993","FaridEss@gmail.com");
            
            n1.addAccount(acc3);
            n2.addAccount(acc4);
            
            db.insertNurse(n1);
            db.insertNurse(n2);
            
            
            pres1= new Prescription();
            pres2= new Prescription();
            
            pres1.addPresciption("You should take this medicine ");
            pres2.addPresciption("You should take this medicine ");
            
            db.insertPrescription(pres1);
            db.insertPrescription(pres2);
                    
                                    
            or1 = new OperationRoom(1,'A',doc1);
            or2= new OperationRoom(1,'C',doc2);
            
            db.insertOperationRoom(or1);
            db.insertOperationRoom(or2);
            

            doc1= new Doctor(5,"Profssor","Dr.Farida Magdy","01228473738","12/9/1980","Dr.Farida12@yahoo.com");
            doc2= new Doctor(5,"Doctor","Dr.Michael Samy","01236463738","22/4/1980","Dr.Michael_Samy@yahoo.com");
            

            
            doc1.addNurses(n2);
            doc1.addOPR(or1);
            doc1.adddTimeslots("Sunday from 9 AM to 11 AM");
            doc1.adddTimeslots("Tusday from 1 PM to 3 PM");
            
            doc2.addNurses(n1);
            doc2.addOPR(or2);
            doc2.adddTimeslots("Saturday from 10 AM to 12 PM");
            doc2.adddTimeslots("Monday from 8 AM to 10 AM");
            
            db.insertDoctor(doc1);
            db.insertDoctor(doc2);
            
            spe1 = new Specialization("Dermatologists");
            spe2 = new Specialization("Ophthalmologists");
            
            spe1.addDoctor(doc1);
            spe1.addDoctor(doc2);
            
            db.insertSpecialization(spe1);
            db.insertSpecialization(spe2);
            
            prof1 = new MedicalProfile("A+");
            prof2 = new MedicalProfile("AB+");
            
            prof1.addChronicDiseases("Diabetes");
            prof1.addMedicines(med3);
            prof1.addPastAppointments(a1);
            prof1.addPrescription(pres1);
            prof1.adddFollowup("Dr.Farida Magdy");
            
            prof2.addChronicDiseases("");
            prof2.addMedicines(med2);
            prof2.addPastAppointments(a4);
            prof2.addPrescription(pres2);
            prof2.adddFollowup("Dr.Michael Samy");
           
            db.insertMedicalProfile(prof1);
             db.insertMedicalProfile(prof2);
            pay1= new Payment("Visa");
            pay2= new Payment("Cash");
            
            db.insertPayment(pay1);
            db.insertPayment(pay2);
            
            a1 = new Appointment("1/2/2019 Monday at 9 am");
            a2 = new Appointment("12/2/2021 tusday at 1 pm");
            a3 = new Appointment("20/1/2021 Saturday at 11 am");
            a4 = new Appointment("21/4/2018a Sunday at 8 pm");
 
            a1.addPayment(pay1);
            a3.addPayment(pay1);
            a2.addPayment(pay2);
            a4.addPayment(pay2);
           
            db.insertAppointment(a1);
            db.insertAppointment(a2);
            db.insertAppointment(a3);
            db.insertAppointment(a4);
            
            o1= new OrderMedicine(1, "Arrived");
            
            o1.addOrder(med2);
            o1.addPayment(pay2);
            
            db.insertOrderMedicine(o1);
            
            p1 = new Patient("25673","234-456-329","167 Masr el gedida","Hossam Amr","012275767464","12/7/1960","Hossam23@yahoo.com");
            p2 = new Patient("","908-543-094","90 El Giza","Amira Mostafa","01564545444","09/8/1970","Amira21@yahoo.com");
            
            p1.addAppointments(a2);
            p1.addOrder(o1);
            p1.addAccount(acc1);
            p1.addMedicalProfile(prof1);
      
            p2.addAppointments(a3);
            p2.addMedicalProfile(prof2);
            p2.addAccount(acc2);
           
            
            db.insertPatient(p1);
            db.insertPatient(p2);
            
            pharma1= new Pharmacist("Mina Fady", "012238484949","08/3/1990","Mina@outlook.com");
            pharma2= new Pharmacist("Dalia Samir", "0112364894","10/8/1989","Dalia109@outlook.com");
            
            db.insertPharmacist(pharma1);
            db.insertPharmacist(pharma2);

            
            
            
            
            
            MedicineInterface medicineinterface = new Medicine();
            
            // My remote object [Skeleton]
            MedicineFacadeInterface facade = new MedicineFacade();
            
            // My RMI Registry
            Registry registry = LocateRegistry.createRegistry(1099);
            
            //Add my object to the RMI Registry
            registry.bind("facade", facade);
            registry.bind("MedicineInterface", medicineinterface);
            
            
      
            System.out.println("My facade is ready...");   
        } catch (Exception ex) {
           System.out.println("Exception occured here ");
        }  
    }
    
}
