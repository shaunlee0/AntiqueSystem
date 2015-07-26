package dadaassignment1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Stock {

    public ArrayList<Item> allItems;
    public ArrayList<Item> allItemsFirstHalf;
    public ArrayList<Item> allItemsSecondHalf;
    ArrayList<Set> sets;

    Stock() {
        allItems = new ArrayList<>();
        allItemsFirstHalf = new ArrayList<>();
        allItemsSecondHalf = new ArrayList<>();
        sets = new ArrayList<>();
    }
    
    public void fillStockRepositories(Scanner sc, Scanner sd) {
        int j = 0;

        /*
        
        Adding of items to allItems
        
        */
        String line; // split of the input file into lines
        String[] sa = null;
        sc.nextLine();//skip first line
        
        while (sc.hasNextLine()) {
            line = sc.nextLine(); //Set line to the next line in scanner
            sa = line.split(","); // split the line on ,

            allItems.add(new Item(Integer.valueOf(sa[0]), sa[1], Double.valueOf(sa[2])));

        }
        sortItemsOnItemNo();//Sort all the items in allItems on Item number after they have been added
        
         /*
        
        Splitting of items into two new repositories
        
        */
        
        for (int i = 0; i < allItems.size()/2; i++) {
            allItemsFirstHalf.add(allItems.get(i));
            
        }
        for (int i = allItems.size()/2; i < allItems.size(); i++) {
            allItemsSecondHalf.add(allItems.get(i));  
        }
        

        /*
        
        Adding of sets to repositories
        
        */
        String line2; // split of the input file into lines
        String[] sa2; // string array to store words on line in, to be used in creation of sets.

        sd.nextLine();//skip first line(Headers)
        while (sd.hasNextLine()) {
            line2 = sd.nextLine(); //Set line to the next line in scanner
            sa2 = line2.split(","); // split the line on , adding these strings to the string array

            for (int i = 0; i < sa2.length; i++) {
                if (sa2[i].equals(" ")) {
                    sa2[i] = null;
                }
            }

            //set details to be added for the set
            sets.add(new Set(Integer.valueOf(sa2[0]),sa2[1],Double.valueOf(sa2[2]),Integer.valueOf(sa2[3])));

            //for loop to add subsequent items to the set, allowing infinite amounts of items to the set
            for (int k = 4; k < sa2.length; k++) {
                if (sa2[k] != null) {//do not add null to the array

                       
                        sets.get(j).ItemsInSetLinked.add(getItem(sa2[k]));//adding to the Linked list of items in set
                        
                    }

                }
            
            j++;
            
        }//while

        
    }//fill stock repositories
    
    public void sortItemsOnItemNo(){
        for (int i = 1; i < allItems.size(); i++) {

            Item current = allItems.get(i);
            double value = allItems.get(i).getItemNo();

            int toCompare = i;

            while (toCompare > 0 && allItems.get(toCompare - 1).getItemNo()> value) {
                allItems.set(toCompare, allItems.get(toCompare - 1));
                toCompare = toCompare - 1;
            }
            allItems.set(toCompare, current);
        }
    }
    
    public void showStock() {
        for (Item i : allItems) {
            i.display();
        }
    }

    public void showSets() {
        for (Set s : sets) {
            s.display();
        }
    }
    //method to search across multiple repositories to find an item and return it.
        public Item findItem(String item) {
        for (Item i : allItems) {
            if (item == null) {
                return null;
            }
            if (i.getItemNo()== Integer.valueOf(item)) {
                
                JOptionPane.showMessageDialog(null, "Found in all items");
                //return i;
            }
        }
        for (Item i : allItemsFirstHalf) {
            if (item == null) {
                return null;
            }
            if (i.getItemNo() == Integer.valueOf(item)) {
                
                JOptionPane.showMessageDialog(null, "Found in all items first half");
                return i;
            }
        }
        for (Item i : allItemsSecondHalf) {
            if (item == null) {
                return null;
            }
            if (i.getItemNo() == Integer.valueOf(item)) {
                
                JOptionPane.showMessageDialog(null, "Found in all items first half");
                return i;
            }
        }
        return null;
    }

    public Item getItem(String item) {
        for (Item i : allItems) {
            if (item == null) {
                return null;
            }
            if (i.getItemNo()== Integer.valueOf(item)) {
                
                
                return i;
            }
        }
        
        return null;
    }
    
    public void removeFromSets(int itemToRemoveNo){
        
        //remove item from Linked List in sets
        for (Set s : sets) {
            if (s != null) {
                for(Iterator<Item> iter1 = s.ItemsInSetLinked.iterator(); iter1.hasNext();){
                    Item i = iter1.next();
                    if (i != null) {//if item is not null
                        if (i.getItemNo() == itemToRemoveNo) {
                            iter1.remove();
                            JOptionPane.showMessageDialog(null, "Item : " + i.display() + " has been removed from set : \n " + s.returnSetInfo());
                            s.updatePriceOfSet();
                        }

                    }

                }
            }
        }//for
        
    }

    public void removeFromAllItems(int ItemNo){
        Item removing = getItem(String.valueOf(ItemNo));
        
        //Remove from allItems
        for(Iterator<Item> iter = allItems.iterator(); iter.hasNext();){
            Item current = iter.next();
            if(current.equals(removing)){
                iter.remove();
                JOptionPane.showMessageDialog(null, " Item removed from all Items");
            }
        }
        //Remove from allItemsFirstHalf
        for(Iterator<Item> iter = allItemsFirstHalf.iterator(); iter.hasNext();){
            Item current = iter.next();
            if(current.equals(removing)){
                iter.remove();
                JOptionPane.showMessageDialog(null, " Item removed from all Items first half repository");
            }
        }
        //Remove from allItemsSecondHalf
        for(Iterator<Item> iter = allItemsSecondHalf.iterator(); iter.hasNext();){
            Item current = iter.next();
            if(current.equals(removing)){
                iter.remove();
                JOptionPane.showMessageDialog(null, " Item removed from all Items second half repository");
            }
        }
    }
    
    public void removeAndReplaceInSetAndAllItems(String ItemNo) {
        Item Removing = getItem(ItemNo);
        String FindSimilar = Removing.getDescription();
        Set FoundSet = null;
        Item ItemToReplace = null;
        double priceToReduce = Removing.getPrice();
        double priceToAdd = 0;

        FoundSet = getSetItemIsIn(ItemNo);

        //item removed within its set
        FoundSet.remove(Removing);

        JOptionPane.showMessageDialog(null, "Item : " + Removing.display() + " has been removed from set : \n \n " + FoundSet.returnSetInfo());
        
        //remove from all items
        removeFromAllItems(Integer.valueOf(ItemNo));
        

        //find replacement
        try {
            for (Item i : allItems) {//loop through all items and find similar item using description
                if (i.getDescription().equals(FindSimilar) && i.getItemNo() != Integer.valueOf(ItemNo) && !FoundSet.ItemsInSetLinked.contains(i)) {
                    ItemToReplace = i;//set item to replace as one with similar description
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No replacement found that is either suitable or not currently in the set");
        }
        JOptionPane.showMessageDialog(null, " Replacement found & Added \n \n" + ItemToReplace.display());

        //add Item to replace one removed to the correct set
        FoundSet.ItemsInSetLinked.add(ItemToReplace);//in linked list
        
        //price workings
        priceToAdd = ItemToReplace.getPrice();
        double oldPrice = FoundSet.getPrice();
        FoundSet.setPrice(FoundSet.getPrice() - priceToReduce + priceToAdd);
        double newPrice = FoundSet.getPrice();

        //if old price is greated than new show discount
        if (oldPrice > newPrice) {
            JOptionPane.showMessageDialog(null, " Set price reduced by : " + Double.toString(oldPrice - newPrice));
        } else
        // else show price increase
        {
            JOptionPane.showMessageDialog(null, " Set price increased by : " + Double.toString(newPrice - oldPrice));
        }

    }
    
    public Set getSet(String SetNo){
        for(Set s : sets){
            if(s.getItemNo() == Integer.valueOf(SetNo)){
                return s;
            }
        }
        return null;
    }

    public Set getSetItemIsIn(String ItemNo) {

        //function used find set item is in then return it, allowing actions carried out on it.
        Set FoundSet = null;
        for (Set s : sets) {
            for (Item it : s.ItemsInSetLinked) {//loop through items in set to find item in question
                if (!(it == null)) {
                    if (it.getItemNo() == Integer.valueOf(ItemNo)) {
                        FoundSet = s;
                    }
                }
            }
        }
        return FoundSet;//if found return it
    }

    public void removeAndReplaceInSetOnly(String ItemNo) {
        
        Item Removing = getItem(ItemNo);
        Item ItemToReplace = null;
        
        String FindSimilar = Removing.getDescription();       
        Set FoundSet = null;
        
        double priceToReduce = Removing.getPrice();// price to reduce is price of item removed
        double priceToAdd = 0;

        FoundSet = getSetItemIsIn(ItemNo);// find set item to remove is in.

        //item removed within its set
        FoundSet.remove(Removing);

        //display item removed, including repository
        JOptionPane.showMessageDialog(null, "Item : " + Removing.display() + " has been removed from set : \n " + FoundSet.returnSetInfo());

        //find replacement
        try {
            for (Item i : allItems) {
                if (i.getDescription().equals(FindSimilar) && i.getItemNo() != Integer.valueOf(ItemNo) && !FoundSet.ItemsInSetLinked.contains(i)) {
                    ItemToReplace = i;
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No replacement found that is either suitable or not currently in the set");
        }
        // if statement as second defence to avoid method returning null value
        if (ItemToReplace == null) {
            JOptionPane.showMessageDialog(null, "No replacement found that is either suitable or not currently in the set");
        }
        //display replacement found
        if (!(ItemToReplace == null)) {
            JOptionPane.showMessageDialog(null, " Replacement found & Added \n \n" + ItemToReplace.display());
            
            //add Item to replace one removed to the correct set
            FoundSet.ItemsInSetLinked.add(ItemToReplace);
            
            //Working out of pricing
            priceToAdd = ItemToReplace.getPrice();
            double oldPrice = FoundSet.getPrice();
            FoundSet.setPrice(FoundSet.getPrice() - priceToReduce + priceToAdd);
            double newPrice = FoundSet.getPrice();

            if (oldPrice > newPrice) {
                JOptionPane.showMessageDialog(null, " Set price reduced by : " + Double.toString(oldPrice - newPrice));
            } else {
                JOptionPane.showMessageDialog(null, " Set price increased by : " + Double.toString(newPrice - oldPrice));
            }
        }

    }
public int nextAvailableItemNo(){
    /*
    Method used to find the next available item number which could be assigned to a new item.
    */
   int high = 0;
    for(Item i : allItems){
        if(i.getItemNo()>high){
            high = i.getItemNo() + 1;
        }
    }
    return high;
}    
    
public void addItemtoAllItems(String description,double price){
    
    allItems.add(new Item(nextAvailableItemNo(),description,price));
}
}
