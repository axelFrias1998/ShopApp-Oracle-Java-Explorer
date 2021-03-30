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
    
    private final double MIN_PRICE = 10;
    private final double TAX = 0.2;
    
    public double getPrice() {
        return price + (price * TAX);
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
