/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.util.ArrayList;

/**
 *
 * @author meriam
 */

public class Appointment implements AppointmentSubject, DoctorAppointmentFunctionalities{
    private String timeslot;
    private Payment payment;
   private ArrayList <PatientObserver> observers = new ArrayList();

    public Appointment() {
    }

    public Appointment(String timeslot, Payment payment) {
        this.timeslot = timeslot;
        this.payment = payment;
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
    
    @Override
    public void addObserver(PatientObserver p )
    {
         observers.add(p);
    }
     @Override
    public void RemoveObserver(PatientObserver m)
    {
         observers.remove(m);
    }
    
    
    @Override
    public void notifyConfirmation(String s){
        
     for (int i = 0; i < observers.size(); i++) {
            observers.get(i).notifyConfirmation(s);
        }
    }
   
     @Override
     public void notifyDetails(String s){
        
     for (int i = 0; i < observers.size(); i++) {
            observers.get(i).notifyDetails(s);
        }
    }

}
