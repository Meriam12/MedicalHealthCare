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
public class MedicalProfile {
    private ArrayList<String> drFollowup = new ArrayList();
    private ArrayList<String> chronicDisease = new ArrayList();
    private ArrayList<Medicine> medicines = new ArrayList();
    private String bloodType;
    private ArrayList<Appointment> pastAppointments = new ArrayList();
    private ArrayList<Prescription> prescriptions = new ArrayList();
    
    public MedicalProfile(){

    }

    public MedicalProfile( ArrayList<String> drFollowup, ArrayList<String> chronicDisease, ArrayList<Medicine> medicines , 
            String bloodType, ArrayList<Appointment> pastAppointments, ArrayList<Prescription> prescriptions) {
        this.drFollowup = drFollowup;
        this.chronicDisease = chronicDisease;
        this.medicines = medicines;
        this.bloodType = bloodType;
        this.pastAppointments = pastAppointments;
        this.prescriptions = prescriptions;
    }
    
    public ArrayList<String> getDrFollowup() {
        return drFollowup;
    }

    public void setDrFollowup(ArrayList<String> drFollowup) {
        this.drFollowup = drFollowup;
    }

    public ArrayList<String> getChronicDisease() {
        return chronicDisease;
    }

    public void setChronicDisease(ArrayList<String> chronicDisease) {
        this.chronicDisease = chronicDisease;
    }

    public ArrayList<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(ArrayList<Medicine> medicines) {
        this.medicines = medicines;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public ArrayList<Appointment> getPastAppointments() {
        return pastAppointments;
    }

    public void setPastAppointments(ArrayList<Appointment> pastAppointments) {
        this.pastAppointments = pastAppointments;
    }

    public ArrayList<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(ArrayList<Prescription> prescriptions) {
        this.prescriptions = prescriptions;
    }

    public void uploadMedicalHistory(ArrayList<String> chronicDisease,ArrayList<Medicine> medicines){
        
    }

    public void reviewMedicalProfile(){
        
    }
  

    public void editMedicalProfile( ArrayList<String> drFollowup, ArrayList<String> chronicDisease, ArrayList<Medicine> medicines , 
            String bloodType, ArrayList<Appointment> pastAppointments, ArrayList<Prescription> prescriptions){
        
    }

    
}
