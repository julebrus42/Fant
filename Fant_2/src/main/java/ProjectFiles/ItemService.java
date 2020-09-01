/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectFiles;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danie
 */
public class ItemService {
    
    public List<Item> getAllItem() {
        Item bike = new Item(1, 500, "Daniel");
        Item door = new Item(2, 1000, "Petter");
        Item book = new Item(3, 350, "Sverre");
        
        List<Item> items = new ArrayList<>();
        items.add(bike);
        items.add(door);
        items.add(book);
        return items;
    }
    
}
