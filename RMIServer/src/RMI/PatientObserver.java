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
public interface PatientObserver {
    
    public void updateConfirmation(String news);
    
    public void updateDetails(String message);
 }
