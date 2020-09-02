/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectFiles;

import static ProjectFiles.Item.FIND_ALL_ITEMS;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author danie
 */
/*@Entity
@Data
@NamedQuery(name = FIND_ALL_ITEMS,
        query = "select i from Item i")
public class Item {
    
    public static final String FIND_ALL_ITEMS = "Item.findAllItems";
    
    @Id
    private long id;
    private int price;
    private Date created;
    private String seller;
    
    public Item() {
        
    }

    public Item(long id, int price, String seller) {
        this.id = id;
        this.price = price;
        this.seller = seller;
        this.created = new Date();
    }
  */

@Entity @Table(name = "'ITEM'")
@Data
@NamedQuery(name = FIND_ALL_ITEMS,
        query= "select i from Item i")
public class Item {
    public static final String FIND_ALL_ITEMS = "Item.findAllItems";
    
    @Id
    private int id;
    private String itemString;
    private Date created;
    private String creator;
    
    public Item() {
        
    }

    public Item(int id, String itemString, String creator) {
        this.id = id;
        this.itemString = itemString;
        this.created = created;
        this.creator = creator;
    }
      
}
