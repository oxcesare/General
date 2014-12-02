/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.companyname.springapp.web.service;

/**
 *
 * @author cesar_ar
 */
import com.companyname.springapp.web.domain.Product;
import java.io.Serializable;
import java.util.List;

public interface ProductManager extends Serializable {

    public void increasePrice(int percentage);

    public List<Product> getProducts();

}
