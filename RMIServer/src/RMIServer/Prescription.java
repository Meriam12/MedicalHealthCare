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
    
    public void uploadPrescription(ArrayList<String> x, Patient p){
        MedicalProfile medpro = new MedicalProfile();
        medpro = p.getMedicalProfile();
        Prescription pres = new Prescription(x);
        Document doc = Document.parse(db.gson.toJson(medpro));
        
//        ArrayList<String> pres = new ArrayList<String>();
//            Prescription p = new Prescription();
//            pres.add("EAt brufen twice a day for 16 days");
//            p.uploadPrescription(pres, p1);
//            System.out.println("end");
//            
//            ArrayList<String> pres2 = new ArrayList<String>();
//            Prescription p2 = new Prescription();
//            pres2.add("sleep");
//            p2.uploadPrescription(pres2, p1);
//            System.out.println("end");
            
    }
    
     public void addPresciption(String prescription)
    {
       prescriptions.add(prescription);
    } 
}
