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
public class Appointment {
    private String timeslot;
    private Payment payment;
    private ArrayList<Patient> ParientAppObservers = new ArrayList();
     private ArrayList<Patient> ParientDeatilsObservers = new ArrayList();

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
    
    void bookAnAppointment(Patient p, Doctor d, String timeslot )
    {
    
    }
    
    void CancelAppointment(Patient p, Doctor d , String timeslot)
    {
    }
    
     void changeAppointment(Patient p, Doctor d , String timeslot)
    {
    }
    
    void sendUpdateInAppointmentDetailsNotification(String s)
    {
    
    }
    void sendAppointmentConfirmationNotification(String s)
    {
    
    }
    public void addAppObserver( Patient p)
    {
         ParientAppObservers.add(p);
    }
    
    public void RemoveAppObserver(Patient m)
    {
         ParientAppObservers.remove(m);
    }
    
    
    public void addDeatilsObserver( Patient o)
    {
         ParientDeatilsObservers.add(o);
    }
    
    public void RemoveDetailsObserver(Patient i)
    {
         ParientDeatilsObservers.remove(i);
    }
    
    public void UpdateConfirmation(String s){
        
     for (int i = 0; i < ParientAppObservers.size(); i++) {
            ParientAppObservers.get(i).updateConfirmation(s);
        }
    }
   
     public void UpdateDetails(String s){
        
     for (int i = 0; i < ParientDeatilsObservers.size(); i++) {
            ParientDeatilsObservers.get(i).updateConfirmation(s);
        }
    }

}
