/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.store.models;

import com.mycompany.store.dto.Cart;
import java.io.Serializable;

/**
 *
 * @author Moe
 */
public class UserModel implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private int id;
    private String username;
    private Boolean isAdmin;
    private Cart cart;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "UserModel{" + "id=" + id + ", username=" + username + ", isAdmin=" + isAdmin + ", cart=" + cart + '}';
    }

    
    
    
    
}
