/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.companyname.springapp.web.repository;

/**
 *
 * @author cesar_ar
 */
import com.companyname.springapp.web.domain.Product;
import java.util.List;



public interface ProductDao {

    public List<Product> getProductList();

    public void saveProduct(Product prod);

}
