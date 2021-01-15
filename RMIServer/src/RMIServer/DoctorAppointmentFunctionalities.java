/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIServer;

/**
 *
 * @author Mariam
 */
public interface DoctorAppointmentFunctionalities {
    
    public void changeAppointment(Patient p, Doctor d , String timeslot);
    
}
