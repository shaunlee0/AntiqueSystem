package dadaassignment1;



public class Item  {
    
    
    private String Description;
    private int ItemNo;
    private double Price;
    
   

    
    
    public Item(int ItemNo,String Description , double Price) {
        this.Description = Description;
        this.ItemNo = ItemNo;
        this.Price = Price;
        
        
    }
    
    
    
    //getters and setters for properties
    public String getDescription() {
        return Description;
    }
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getItemNo() {
       if(ItemNo == 0){
           return 0;
       }
       else{
         return ItemNo;  
       }
        
    }
    public void setItemNo(int ItemNo) {
        this.ItemNo = ItemNo;
    }      

    public double getPrice() {
        return Price;
    }
    public void setPrice(double Price) {
        this.Price = Price;
    }
    
    public String display(){
        
        //to Console ting 
        //System.out.println("Item No : " + ItemNo + " Description of item : " + Description);
        
        return "Item No : " + ItemNo + " Description of item : " + Description + " Price : "+ Price + " " ;
    }
//    public void addItem(int itemNo,String description, double price){
//        items.add(new Item(itemNo,description,price));
//        
//    }

    
    
    
}
