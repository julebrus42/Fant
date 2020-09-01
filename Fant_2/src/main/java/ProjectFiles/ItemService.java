/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectFiles;

import database.DatabaseClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author danie
 */
public class ItemService {
    
    private Map<Long, Item> items = DatabaseClass.getItems();
    
    public ItemService() {
        items.put(1L, new Item(1, 50000, "Daniel"));
        items.put(2L, new Item(2, 1212, "Petter"));
    }
    
    public List<Item> getAllItem()
    {
        return new ArrayList<Item>(items.values());
    }
    
    
    public Item getItem(long id) {
        return items.get(id);
    }
    
    public Item addItem(Item item) {
        item.setId(items.size() + 1);
        items.put(item.getId(), item);
        return item;
    }
    
    public Item updateItem(Item item) {
        if(item.getId() <= 0) {
            return null;
        }
        items.put(item.getId(), item);
        return item;
    }
    
    public Item removeItem(long id) {
        return items.remove(id);
    }

} 

