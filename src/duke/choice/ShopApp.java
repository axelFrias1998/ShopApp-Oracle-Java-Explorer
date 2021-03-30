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
public class ShopApp {

    public static void main(String [] args){
        final double TAX = 0.2;
        
        Customer c1 = new Customer("Pinky");
        c1.setSize(3);
        
        System.out.println("Welcome to Duke Choice Shop, " + c1.getName() + "!\n Your size: " + c1.getSize() );
        
        Clothing item1 = new Clothing();
        item1.setPrice(20.9);
        item1.setDescription("Blue Jacket");
        item1.setSize("X");
        
        Clothing item2 = new Clothing();
        item2.setDescription("Orange T-Shirt");
        item2.setPrice(19.5);
        item2.setSize("S");
        
        Clothing item3 = new Clothing();
        item3.setDescription("Orange T-Shirt");
        item3.setPrice(10.5);
        item3.setSize("S");
        
        Clothing item4 = new Clothing();
        item4.setDescription("Green Scarf");
        item4.setPrice(5);
        item4.setSize("S");
        
        Clothing item5 = new Clothing();
        item5.setDescription("Blue T-Shirt");
        item5.setPrice(10.5);
        item5.setSize("S");
        
        Clothing[] items = {item1, item2, item3, item4, item5 };
        c1.addItems(items);
        
        for(Clothing item: c1.getItems()){
            if(c1.getSize().equals(item.getSize())){
                System.out.println("ITEM: " + item.getDescription() + ". SIZE: " + item.getSize() + ". PRICE: $" + item.getPrice());
            }
        }
        
        System.out.println("TOTAL: $" + c1.getTotalClothingCost());
        
        
        
    }
}
