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

    public Admin() {
    }

    public Admin(int id, String name, String phonenumber, String birthdate, String email) {
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
   
   
     
     
}
