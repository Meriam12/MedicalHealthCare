/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIServer;

import com.mongodb.MongoClient;
import com.mongodb.client.model.Filters;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;

/**
 *
 * @author meriam
 */

public class Appointment implements DoctorAppointmentFunctionalities{
    private String timeslot;
    private Payment payment;
    
    DB db;
   

    public Appointment() {
           Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
mongoLogger.setLevel(Level.SEVERE);



// Initialize
db = new DB();
db.mongoClient = new MongoClient();
db.database = db.mongoClient.getDatabase("MedicalHealthCare"); // Database name
// db.collection9 = db.database.getCollection("Medicine"); // Collection name
    }

    public Appointment(String timeslot, Payment payment) {
        this.timeslot = timeslot;
        this.payment = payment;
    }

    public Appointment(String timeslot) {
        this.timeslot = timeslot;
    }
 
    
    public String getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(String timeslot) {
        this.timeslot = timeslot;
    }
    
    public void bookAnAppointment(String timeslot) throws RemoteException
    {
        Appointment newAppObject = new Appointment (timeslot);
        db.collection6.insertOne(Document.parse(db.gson.toJson(newAppObject)));
        String message = "Your appointment has been booked successfully.";
        sendAppointmentConfirmationNotification(message);
    }
    
    public void CancelAppointment(String timeslot,String PatientName) throws RemoteException
    {
          Document doc = db.collection2.find(Filters.eq("name", PatientName)).first();
         Patient result = db.gson.fromJson(doc.toJson(), Patient.class);
        for (int i=0; i<result.getComingAppointments().size();i++)
        {
            if (timeslot.equals(result.getComingAppointments().get(i)))
            {
                 
              result.getComingAppointments().remove(i);
            }
           
           db.insertPatient(result);
        }
         
          
         System.out.println("Deleted");
//       Document doc = db.collection2.find(Filters.eq("commingAppointment", timeslot)).first();
//       Patient result = db.gson.fromJson(doc.toJson(), Patient.class);
//       
//       db.collection6.deleteOne(Filters.eq("timeslot", timeslot));
//       System.out.println("Your appointment has been canceled.");
       // System.out.println(payment.refund());
    }
    
    public void bookThePatientFollowUpAppointment(Patient p, Doctor d, String timeslot){
        //HEREEEE COLLECTION6
        Payment pay = new Payment("Cash", new Cash(), 0);
        ArrayList<Appointment> appoint = new ArrayList<Appointment>();
        appoint.add(new Appointment(timeslot, pay));
        db.collection6.insertOne(Document.parse(db.gson.toJson(new Appointment(timeslot))));
        p.setComingAppointments(appoint);
        String message = "Follow-up appointment successfully booked.";
        sendAppointmentConfirmationNotification(message);
    }
    
    @Override
    public void changeAppointment(String timeslot) throws RemoteException
    {
     Appointment newAppObject = new Appointment (timeslot);
                Document doc = Document.parse(db.gson.toJson(newAppObject));
               db.collection9.replaceOne(Filters.eq("timeslot", newAppObject.getTimeslot()), doc);
        
    String s= "Your appointment has been updated successfully.";
    sendUpdateInAppointmentDetailsNotification(s); 
    }
    
    public void sendUpdateInAppointmentDetailsNotification(String s)
    {
     System.out.println("Your appointment has been updated successfully.");
    }
    public void sendAppointmentConfirmationNotification(String message)
    {
     System.out.println("Your appointment has been booked successfully.");
    }

     public void addPayment(Payment p)
    {
       this.payment=p ;
    }

}
