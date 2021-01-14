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
public class Payment {
    private String paymentMethod;
    private PaymentMethod p;

    public Payment(String paymentMethod, PaymentMethod p) {
        this.paymentMethod = paymentMethod;
        this.p = p;
    }

    public Payment(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
    

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PaymentMethod getP() {
        return p;
    }

    public void setP(PaymentMethod p) {
        this.p = p;
    }
    
    //FUNCTIONS
    
    public void refund(){
        
    }
    
    
    public void makeAppointmentPayment(){
        
    }
    
   
    public void payMedicine(){
        
    }
    
    
}
