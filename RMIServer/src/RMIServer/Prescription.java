/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIServer;

import com.mongodb.MongoClient;
import com.mongodb.client.model.Filters;
import java.rmi.RemoteException;
import java.util.ArrayList;
import org.bson.Document;
import java.util.*;

/**
 *
 * @author meriam
 */
public class Prescription {
    private ArrayList<String> prescriptions= new ArrayList();
DB db = new DB();
    public Prescription() {
    }

    
    
    public Prescription(ArrayList<String> prescription) {
       prescriptions = prescription;
    }

    public ArrayList<String> getPrescription() {
        return prescriptions;
    }

    public void setPrescription(ArrayList<String> prescription) {
        prescriptions = prescription;
    }
    // FUNCTIONS
    
    public void uploadPrescription(ArrayList<String> x, String pName){
        Document coll = db.collection2.find(Filters.eq("name", pName)).first();
        Patient pat = db.gson.fromJson(coll.toJson(), Patient.class);
        MedicalProfile medpro = new MedicalProfile();
        medpro = pat.getMedicalProfile();
        
        ArrayList<Prescription> pres = new ArrayList<Prescription>();
        pres.add(new Prescription(x));
        medpro.setPrescriptions(pres);
       pat.setMedicalProfile(medpro);
       Document result = Document.parse(db.gson.toJson(pat));
        System.out.println("processed");
       db.collection2.replaceOne(Filters.eq("name", pName), result);
        System.out.println("done");
    
               
               
               
        
    }
    
     public void addPresciption(String prescription)
    {
       prescriptions.add(prescription);
    } 
}
