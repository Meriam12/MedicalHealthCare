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

public class Patient extends User{
  private ArrayList<Appointment> comingAppointments;
  private MedicalProfile medicalProfile;
  private String medicalInsurance;
  private String creditCardNumber;
  private String access;
  private ArrayList<OrderMedicine> ordeMedicine;
  private Account account;

    public Patient(ArrayList<Appointment> comingAppointments, MedicalProfile medicalProfile, String medicalInsurance, String creditCardNumber, String access, ArrayList<OrderMedicine> ordeMedicine, Account account) {
        this.comingAppointments = comingAppointments;
        this.medicalProfile = medicalProfile;
        this.medicalInsurance = medicalInsurance;
        this.creditCardNumber = creditCardNumber;
        this.access = access;
        this.ordeMedicine = ordeMedicine;
        this.account = account;
    }

    public Patient(ArrayList<Appointment> comingAppointments, MedicalProfile medicalProfile, String medicalInsurance, String creditCardNumber, String access, ArrayList<OrderMedicine> ordeMedicine, Account account, String name, String phonenumber, String birthdate, String email) {
        super(name, phonenumber, birthdate, email);
        this.comingAppointments = comingAppointments;
        this.medicalProfile = medicalProfile;
        this.medicalInsurance = medicalInsurance;
        this.creditCardNumber = creditCardNumber;
        this.access = access;
        this.ordeMedicine = ordeMedicine;
        this.account = account;
    }

    

    public ArrayList<Appointment> getComingAppointments() {
        return comingAppointments;
    }

    public void setComingAppointments(ArrayList<Appointment> comingAppointments) {
        this.comingAppointments = comingAppointments;
    }

    public MedicalProfile getMedicalProfile() {
        return medicalProfile;
    }

    public void setMedicalProfile(MedicalProfile medicalProfile) {
        this.medicalProfile = medicalProfile;
    }

    public String getMedicalInsurance() {
        return medicalInsurance;
    }

    public void setMedicalInsurance(String medicalInsurance) {
        this.medicalInsurance = medicalInsurance;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public ArrayList<OrderMedicine> getOrdeMedicine() {
        return ordeMedicine;
    }

    public void setOrdeMedicine(ArrayList<OrderMedicine> ordeMedicine) {
        this.ordeMedicine = ordeMedicine;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
    public void update(String x){
        
    }
    public void updateStatus(String y){
        
    }
}
