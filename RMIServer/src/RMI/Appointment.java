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
    private ArrayList<Patient> ParientObservers = new ArrayList();

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
    
    
    
}
