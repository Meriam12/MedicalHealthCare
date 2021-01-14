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


public class Patient extends User implements PatientObserver {

  private ArrayList<Appointment> comingAppointments = new ArrayList();
  private MedicalProfile medicalProfile;
  private String medicalInsurance;
  private String creditCardNumber;
  private String address;
  private ArrayList<OrderMedicine> ordeMedicines = new ArrayList();;
  private Account a;

    public Patient() {
    }

    public Patient(ArrayList<Appointment> comingAppointments, MedicalProfile medicalProfile, String medicalInsurance, String creditCardNumber, String address, ArrayList<OrderMedicine> ordeMedicine, String name, String phonenumber, String birthdate, String email) {
        super(name, phonenumber, birthdate, email);
        this.comingAppointments = comingAppointments;
        this.medicalProfile = medicalProfile;
        this.medicalInsurance = medicalInsurance;
        this.creditCardNumber = creditCardNumber;
        this.address = address;
        this.ordeMedicines = ordeMedicine;
       
    }

    public Patient(String medicalInsurance, String creditCardNumber, String address, String name, String phonenumber, String birthdate, String email) {
        super(name, phonenumber, birthdate, email);
        this.medicalInsurance = medicalInsurance;
        this.creditCardNumber = creditCardNumber;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   

    public ArrayList<OrderMedicine> getOrdeMedicine() {
        return ordeMedicines;
    }

    public void setOrdeMedicine(ArrayList<OrderMedicine> ordeMedicine) {
        this.ordeMedicines = ordeMedicine;
    }

    @Override
    public void notifyConfirmation(String news)
    {
        System.out.println( getName() + ", You have recieved a message that say: " + news);
    
    }
    
    @Override
    public void notifyDetails(String message)
    {
    System.out.println( getName() + ", You have recieved a message that say: " + message);
    
    }
    
     public void addAppointments(Appointment a) 
     
    {
        comingAppointments.add(a);
    }
       
    public void addOrder(OrderMedicine o) {
        ordeMedicines.add(o);
    }
    
    public void addAccount(Account a)
    {
       this.a=a ;
    }
   
      public void addMedicalProfile(MedicalProfile medprof)
    {
       this.medicalProfile=medprof ;
    }
}
