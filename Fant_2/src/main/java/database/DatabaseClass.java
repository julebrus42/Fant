/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import ProjectFiles.Item;
import ProjectFiles.User;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author danie
 */
public class DatabaseClass {
    private static Map<Long, Item> items = new HashMap<>();
    private static Map<Long, User> users = new HashMap<>();

    public static Map<Long, Item> getItems() {
        return items;
    }

    public static Map<Long, User> getUsers() {
        return users;
    }
    
}
