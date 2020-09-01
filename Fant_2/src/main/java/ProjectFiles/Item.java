/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectFiles;

import java.util.Date;

/**
 *
 * @author danie
 */
public class Item {
    
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
    
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }
    
}
