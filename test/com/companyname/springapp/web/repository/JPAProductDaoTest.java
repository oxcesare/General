/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.companyname.springapp.web.repository;

import com.companyname.springapp.web.domain.Product;
import java.util.List;
import javax.persistence.EntityManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cesar_ar
 */
public class JPAProductDaoTest {
    
    public JPAProductDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setEntityManager method, of class JPAProductDao.
     */
    @Test
    public void testSetEntityManager() {
        System.out.println("setEntityManager");
        EntityManager em = null;
        JPAProductDao instance = new JPAProductDao();
        instance.setEntityManager(em);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductList method, of class JPAProductDao.
     */
    @Test
    public void testGetProductList() {
        System.out.println("getProductList");
        JPAProductDao instance = new JPAProductDao();
        List<Product> expResult = null;
        List<Product> result = instance.getProductList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveProduct method, of class JPAProductDao.
     */
    @Test
    public void testSaveProduct() {
        System.out.println("saveProduct");
        Product prod = null;
        JPAProductDao instance = new JPAProductDao();
        instance.saveProduct(prod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
