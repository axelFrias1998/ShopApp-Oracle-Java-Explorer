/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duke.choice;

/**
 *
 * @author axelf
 */
public class Clothing {
    private String description;
    private String size = "M";
    private double price;
    
    public final static double MIN_PRICE = 10;
    public final static double TAX_RATE = 0.2;
    
    public Clothing(String description, double price, String size){
        this.description = description;
        this.setPrice(price);
        this.size = size;
    }
    
    public double getPrice() {
        return price + (price * TAX_RATE);
    }

    public void setPrice(double price) {
        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }          
}
