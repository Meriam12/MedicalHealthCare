/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIServer;

import org.bson.Document;

/**
 *
 * @author noura
 */
public class Cash implements PaymentMethod{
    DB db = new DB();
    @Override
    public String makeAppointmentPayment(String pName, int price, String cardno){
        Document dd = new Document("paymentType", "Cash").append("cost", price);
        db.collection12.insertOne(dd);
        
        return "Payment Successful.";
    }
    
    @Override
    public String payMedicine(String pName, int price, String cardno){
        Document dd = new Document("paymentType", "Cash").append("cost", price);
        db.collection12.insertOne(dd);
        
        return "Payment Successful.";
    }
    
}
