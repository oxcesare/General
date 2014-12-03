/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.companyname.springapp.web.repository;


import java.util.List;


/**
 *
 * @author cesar_ar
 */
public class InMemoryProductDao {
    
    
    private List<Product> productList;

    public InMemoryProductDao(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void saveProduct(Product prod) {
        
        
    }
    
    
    
    
    
}
