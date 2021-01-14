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
public class Account {
    private String username;
    private String password;
    private String accountType;

    public Account() {
    }

    public Account(String username, String password, String accountType) {
        this.username = username;
        this.password = password;
        this.accountType = accountType;
    }

  

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    
    
    
    void login (String username, String Password)
    {
    
    
    }
    
//    boolean verifyLogin()
//    {
//        
//
//    }
//    
    
    void createAccount(String username, String pass)
    {
    
    }
    
    void deleteAccount(String username)
    {
    
       
    }
    
    
    void updateAccount(String username, String pass)
    {
    
    }
    
}
