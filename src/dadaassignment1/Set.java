package dadaassignment1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Set {
    private int ItemNo;
    private String Description;
    private double Price;
    private int NumberOfItems;
    
    LinkedList<Item> ItemsInSetLinked = new LinkedList();

    public Set(int ItemNo, String Description, double Price, int NumberOfItems) {
        this.ItemNo = ItemNo;
        this.Description = Description;
        this.Price = Price;
        this.NumberOfItems = NumberOfItems;
    }
    
    public void add(Item adding){
        ItemsInSetLinked.add(adding);
        updatePriceOfSet();
    }
    
    public void remove(Item removing){
        ItemsInSetLinked.remove(removing);
        updatePriceOfSet();
    }
    
    public StringBuilder display(){
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("===================   START OF SET   ===========================================");
        stringBuilder2.append("\n");
        stringBuilder2.append(returnSetInfo()); 
        stringBuilder2.append("\n");
        stringBuilder2.append("-----------------------------------------------------------------------------------------------------------------------");
        stringBuilder2.append("\n");
        
        for(Item i : ItemsInSetLinked){
            if(i != null){
            stringBuilder2.append(i.display());
            stringBuilder2.append("\n");
            stringBuilder2.append("Next Link : ");
            stringBuilder2.append("\n");
            }
        }
        
        stringBuilder2.append("======================END OF SET ===============" + "\n" + "\n");
        return stringBuilder2;
    }
    
    public void displayToConsole(){
         StringBuilder stringBuilder2 = new StringBuilder();
        System.out.println("===================   START OF SET   ===========================================");
        
        System.out.println(returnSetInfo()); 
        
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n");
        
        for(Item i : ItemsInSetLinked){
            if(i != null){
            System.out.println(i.display());
            stringBuilder2.append("\n");
            stringBuilder2.append("\n");
            System.out.println("Next Link : ");
            System.out.println();
            }
        }
        
        System.out.println("======================END OF SET ===============" + "\n" + "\n");
        
    }
    
    public String returnSetInfo(){
         
        return "Set Iem No : " + ItemNo + " Description of Set : " + Description + " Number of items : " + NumberOfItems + " Price : " + Price;
         
    
    }

    public int getItemNo() {
        return ItemNo;
    }

    public void setItemNo(int ItemNo) {
        this.ItemNo = ItemNo;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getNumberOfItems() {
        return NumberOfItems;
    }

    public void setNumberOfItems(int NumberOfItems) {
        this.NumberOfItems = NumberOfItems;
    }
    
    public void updatePriceOfSet(){
        double newPrice = 0;
        for (Item i : ItemsInSetLinked){
            newPrice += i.getPrice();
        }
        Price = newPrice;
       
    }
    
    
    
    
    
   
}
