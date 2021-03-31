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
        Customer c1 = new Customer("Pinky", 3);
        
        System.out.println("Welcome to Duke Choice Shop, " + c1.getName() + "!\n Your size: " + c1.getSize() );
        
        System.out.println("Min price: $" + Clothing.MIN_PRICE);
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "X");
        Clothing item2 = new Clothing("Orange T-Shirt", 19.5, "S");
        Clothing item3 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item4 = new Clothing("Green Scarf", 5, "S");
        Clothing item5 = new Clothing("Blue T-Shirt", 10.5, "S");
        
        Clothing[] items = {item1, item2, item3, item4, item5 };
        c1.addItems(items);
        
        for(Clothing item: c1.getItems()){
            if(c1.getSize().equals(item.getSize())){
                System.out.println("ITEM: " + item.getDescription() + ". SIZE: " + item.getSize() + ". PRICE: $" + item.getPrice());
            }
        }
        
        int average = 0;
        int count = 0;
        for(Clothing item: c1.getItems()){
            if(item.getSize().equals("L")){
                average += item.getPrice();
                count++;
            }
        }
        try{
            average = (count == 0) ? 0 : average / count;
            System.out.println("Average price: $" + average);
        } catch(ArithmeticException ex){
            System.out.println("Don't divide by 0.");
        }
        
        System.out.println("TOTAL: $" + c1.getTotalClothingCost());
        
        
        
    }
}
