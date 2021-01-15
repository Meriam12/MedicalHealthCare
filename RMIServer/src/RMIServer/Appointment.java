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
import org.bson.Document;

/**
 *
 * @author meriam
 */

public class Appointment implements DoctorAppointmentFunctionalities{
    private String timeslot;
    private Payment payment;
    
    DB db = new DB();

    public Appointment() {
           db.mongoClient = new MongoClient();
        db.database = db.mongoClient.getDatabase("MedicalHealthCare");
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
    
    public void CancelAppointment(String timeslot) throws RemoteException
    {
        db.collection6.deleteOne(Filters.eq("timeslot", timeslot));
        System.out.println("Your appointment has been canceled.");
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
