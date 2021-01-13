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
public class Medicine {
    private String name;
    private String type;
    private String expiredDate;
    private int amountInStock;
    private int price;
    
    public Medicine(){
        
    }

    public Medicine(String name, String type, String expiredDate, int amountInStock, int price) {
        this.name = name;
        this.type = type;
        this.expiredDate = expiredDate;
        this.amountInStock = amountInStock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }

    public int getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(int amountInStock) {
        this.amountInStock = amountInStock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public void postMedicine(String name, String type, String expiredDate, int amountInStock, int price){
        
    }
    
    public void deleteMedicine(String name){
        
    }
    
    public void editMedicine(String name){
        
    }

}
