/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIServer;

import com.mongodb.MongoClient;
import com.mongodb.client.model.Filters;
import java.rmi.RemoteException;
import org.bson.Document;

/**
 *
 * @author meriam
 */
public class Account {
    private String username;
    private String password;
    private String accountType;

     DB db = new DB();
     
    public Account() throws RemoteException {
          db.mongoClient = new MongoClient();
     db.database = db.mongoClient.getDatabase("MedicalHealthCare"); 
    }

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
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
    
    
    
    void login (String username, String Password) throws RemoteException
    {
    
    
    }
     
    
    void createAccount(String username, String pass) throws RemoteException
    {
     Account newAccountObject = new Account(username, pass);
        db.collection5.insertOne(Document.parse(db.gson.toJson(newAccountObject)));
        System.out.println("The Account has been created.");
      
    }
    
    void deleteAccount(String username) throws RemoteException
    {
        db.collection5.deleteOne(Filters.eq("username", username));
        System.out.println("The Account has been deleted.");
    }
    
    
    void updateAccount(String username, String pass) throws RemoteException
    {
                Account newAccObject = new Account(username, pass);
                Document doc = Document.parse(db.gson.toJson(newAccObject));
               db.collection5.replaceOne(Filters.eq("username", newAccObject.getUsername()), doc);
               System.out.println("The Account has been updated.");
    }
    
}
