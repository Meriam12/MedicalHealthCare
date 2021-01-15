/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIServer;

import java.util.ArrayList;

/**
 *
 * @author meriam
 */

public class Appointment implements DoctorAppointmentFunctionalities{
    private String timeslot;
    private Payment payment;
    

    public Appointment() {
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
    
    public void bookAnAppointment(Patient p, Doctor d, String timeslot )
    {
    
    }
    
    public void CancelAppointment(Patient p, Doctor d , String timeslot)
    {
        /**
        collection.deleteOne(Filters.eq("timeslot", timeslot));
        */
    }
    
   
    
    @Override
    public void changeAppointment(Patient p, Doctor d , String timeslot)
    {
        
    }
    
    public void sendUpdateInAppointmentDetailsNotification(String s)
    {
    
    }
    public void sendAppointmentConfirmationNotification(String s)
    {
    
    }

     public void addPayment(Payment p)
    {
       this.payment=p ;
    }

}
