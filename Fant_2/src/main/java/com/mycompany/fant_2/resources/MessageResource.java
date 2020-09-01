/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fant_2.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ProjectFiles.Item;
import ProjectFiles.ItemService;
import java.util.List;

/**
 *
 * @author danie
 */
@Path("/items")
public class MessageResource {
    
    ItemService itemService = new ItemService();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Item> getItems() {
        return itemService.getAllItem();
    }
    
    
    
}
