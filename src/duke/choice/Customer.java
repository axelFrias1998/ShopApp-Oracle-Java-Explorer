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
public class Customer {

    private String name;
    private String size;
    private Clothing[] items;
    
    public Customer(){ }
    
    public Customer(String name)
    {
        this.name = name;
    }
    public void addItems(Clothing[] items){
        this.items = items;
    }
    
    public Clothing[] getItems(){
        return items;
    }
    
    public double getTotalClothingCost(){
        double total = 0;
        for(Clothing item: items){
            if(this.size.equals(item.getSize())){
                total += item.getPrice();
            }
        }
        return total;
    } 
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    public void setSize(int measurement){
        switch(measurement){
            case 1, 2, 3:
                this.size = "S";
                break;
            case 4, 5, 6:
                this.size = "M";
                break;
            case 7, 8, 9:
                this.size = "L";
                break;
            default:
                this.size = "X";
        }
    }
}
