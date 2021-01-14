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
public class Pharmacist extends User {
    Account account;

    public Pharmacist() {
    }

    public Pharmacist(String name, String phonenumber, String birthdate, String email) {
        super(name, phonenumber, birthdate, email);
    }
    
     public void addAccount(Account a)
    {
       this.account=a ;
    }
    
}
