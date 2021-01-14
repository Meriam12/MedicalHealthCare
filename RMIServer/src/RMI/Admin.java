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
public class Admin extends User{
    private int id;
    private static Admin admin;
    private Account account;
 
    private Admin() 
    {
        admin= new Admin(1,"Morad Ossman","0123434343","19/2/1992","MoradF2@yahoo.com");
    }

    private Admin(int id, String name, String phonenumber, String birthdate, String email) {
        super(name, phonenumber, birthdate, email);
        this.id = id;
    }

  

   public static Admin getInstance()
    {
        if ( admin == null )
        {
            admin = new Admin();
        }
        return admin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
   
     public void addAccount(Account a)
    {
       this.account=a ;
    }
     
}
