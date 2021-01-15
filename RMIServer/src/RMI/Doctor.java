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
public class Doctor extends User implements UserObserver{
    private int rating;
    private String levelOfExpertise;
    private ArrayList<Nurse> nurse = new ArrayList();
    private ArrayList<String> timeSlots = new ArrayList();
    private Account account;
    private ArrayList<OperationRoom> operationRooms = new ArrayList();
    private DoctorAppointmentFunctionalities doctorAppointmentFunctionalities;
    private DoctorMedicalFunctionalities doctorMedicalFunctionalities;
    
    public Doctor(){
         
     }

    public Doctor(int id, String name, String phonenumber, String birthdate, String email,int rating, String levelOfExpertise, ArrayList<Nurse> nurse,ArrayList<String> timeSlots,  Account account,ArrayList<OperationRoom> operationRooms) {
        super(name, phonenumber, birthdate, email);
        this.rating = rating;
        this.levelOfExpertise = levelOfExpertise;
        this.nurse = nurse;
        this.timeSlots = timeSlots;
        this.account = account;
        this.operationRooms = operationRooms;
    }

    public Doctor(int rating, String levelOfExpertise, String name, String phonenumber, String birthdate, String email) {
        super(name, phonenumber, birthdate, email);
        this.rating = rating;
        this.levelOfExpertise = levelOfExpertise;
    }
    
    

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getLevelOfExpertise() {
        return levelOfExpertise;
    }

    public void setLevelOfExpertise(String levelOfExpertise) {
        this.levelOfExpertise = levelOfExpertise;
    }

    public ArrayList<Nurse> getNurse() {
        return nurse;
    }

    public void setNurse(ArrayList<Nurse> nurse) {
        this.nurse = nurse;
    }

    public ArrayList<String> getTimeSlots() {
        return timeSlots;
    }

    public void setTimeSlots(ArrayList<String> timeSlots) {
        this.timeSlots = timeSlots;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public ArrayList<OperationRoom> getOperationRooms() {
        return operationRooms;
    }

    public void setOperationRooms(ArrayList<OperationRoom> operationRooms) {
        this.operationRooms = operationRooms;
    }
    
    public void makeRating(int rating){
        
    }
    
    public Doctor selectDoctor(int id) {
        return null;
    }
    
    public void editProfile(String levelOfExpertise, ArrayList<Nurse> nurse,ArrayList<String> timeSlots,  Account account,ArrayList<OperationRoom> operationRooms){
        
    }
    
     @Override
    public void update(String message)
    {
       System.out.println(getName() + " recevied an email that says: " + message);
    }
    
     public void addNurses(Nurse n) 
     {
        nurse.add(n);
    }
        
     public void addOPR(OperationRoom o) 
    {
        operationRooms.add(o);
    }
       
      public void adddTimeslots(String timeslots)
    {
       timeSlots.add(timeslots);
    }  
    
     public void addAccount(Account a)
    {
       this.account=a ;
    }
 
}
