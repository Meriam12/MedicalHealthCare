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
public interface PaymentMethod {
    
    public String makeAppointmentPayment(String pName, int price, String cardno);
    public String  payMedicine(String pName, int price, String cardno);
    
}
