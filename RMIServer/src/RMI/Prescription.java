/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.util.*;

/**
 *
 * @author meriam
 */
public class Prescription {
    private ArrayList<String> prescriptions;

    public Prescription() {
    }

    
    
    public Prescription(ArrayList<String> prescription) {
       prescriptions = prescription;
    }

    public ArrayList<String> getPrescription() {
        return prescriptions;
    }

    public void setPrescription(ArrayList<String> prescription) {
        prescriptions = prescription;
    }
    // FUNCTIONS
    
    public void uploadPrescription(ArrayList<String> x){
        
    }
    
     public void addPresciption(String prescription)
    {
       prescriptions.add(prescription);
    } 
}
