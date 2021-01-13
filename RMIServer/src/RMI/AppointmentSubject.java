/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

/**
 *
 * @author meriam
 */
public interface AppointmentSubject {
    
    public void addObserver( PatientObserver p);
    
    public void RemoveObserver(PatientObserver m);
    
    public void notifyConfirmation(String s);
    
     public void notifyDetails(String s);
    
}
