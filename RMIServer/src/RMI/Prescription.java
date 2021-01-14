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
    private ArrayList<String> prescription;

    public Prescription() {
    }

    
    
    public Prescription(ArrayList<String> prescription) {
        this.prescription = prescription;
    }

    public ArrayList<String> getPrescription() {
        return prescription;
    }

    public void setPrescription(ArrayList<String> prescription) {
        this.prescription = prescription;
    }
    // FUNCTIONS
    
    public void uploadPrescription(ArrayList<String> x){
        
    }
    
     public void adddPresciption(String prescription)
    {
       this.prescription.add(prescription);
    } 
}
