/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIServer;

/**
 *
 * @author noura
 */
public class Cash implements PaymentMethod{
    
    @Override
    public String makeAppointmentPayment(){
        int amount;
        amount = 100;
        return  "When you arrive to our hospital, you have to pay " + amount;
    }
    
    @Override
    public String payMedicine(){
        int amount;
        amount = 100;
        return  "We will come to your address after 2 days, you have to pay " + amount;
    }
    
}
