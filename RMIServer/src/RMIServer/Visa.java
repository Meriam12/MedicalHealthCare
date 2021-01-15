/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIServer;

//import RMIServer.PaymentMethod;

/**
 *
 * @author noura
 */
public class Visa implements PaymentMethod {
    
    
    @Override
    public String makeAppointmentPayment(){
        int amount;
        amount = 12;
        return  "We will take from your credit card " + amount + " Pounds";
    }
    
    @Override
    public String  payMedicine(){
        int amount;
        amount = 12;
        return  "We will take from your credit card " + amount + " Pounds";
    }
}
