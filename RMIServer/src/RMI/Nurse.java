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
import java.util.*;

public class Nurse extends User{
    private String AssignedDoctor;
    private Account account;

    public Nurse() {
    }

    public Nurse(String AssignedDoctor, String name, String phonenumber, String birthdate, String email) {
        super(name, phonenumber, birthdate, email);
        this.AssignedDoctor = AssignedDoctor;
    }

   

    
    public Nurse(String AssignedDoctor, Account account) {
        this.AssignedDoctor = AssignedDoctor;
        this.account = account;
    }

    public String getAssignedDoctor() {
        return AssignedDoctor;
    }

    public void setAssignedDoctor(String AssignedDoctor) {
        this.AssignedDoctor = AssignedDoctor;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
    public ArrayList<Doctor> selectSpecialization(String S){
    
        return null;
    }
    
        public void addAccount(Account a)
    {
       this.account=a ;
    }
}