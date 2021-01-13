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
public class Doctor extends User{
    private int rating;
    private String levelOfExpertise;
    private ArrayList<Nurse> nurse = new ArrayList();
    private ArrayList<String> timeSlots = new ArrayList();
    private Account account;
    private ArrayList<OperationRoom> operationRooms = new ArrayList();
    private DoctorAppointmentFunctionalities doctorAppointmentFunctionalities;
    private DoctorMedicalFunctionalities doctorMedicalFunctionalities;

    public Doctor(int id, String name, String phonenumber, String birthdate, String email,int rating, String levelOfExpertise, ArrayList<Nurse> nurse,ArrayList<String> timeSlots,  Account account,ArrayList<OperationRoom> operationRooms) {
        super(name, phonenumber, birthdate, email);
        this.rating = rating;
        this.levelOfExpertise = levelOfExpertise;
        this.nurse = nurse;
        this.timeSlots = timeSlots;
        this.account = account;
        this.operationRooms = operationRooms;
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
    
    public Doctor selectDoctor() {
        return null;
    }
    
    public void editProfile(){
        
    }
    


}
