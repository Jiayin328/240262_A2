/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum._a2;

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carynne
 */
public class ScanCommentTest {
    
    public ScanCommentTest() {
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
     * Test of getSem method, of class ScanComment.
     * @throws java.io.IOException
     */
    @Test
    public void testGetSem() throws IOException {
        System.out.println("getSem");
        ScanComment instance = new ScanComment();
        String expResult = "A171";
        String result = instance.getSem();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCourse method, of class ScanComment.
     * @throws java.io.IOException
     */
    @Test
    public void testGetCourse() throws IOException {
        System.out.println("getCourse");
        ScanComment instance = new ScanComment();
        String expResult = "STIW3054";
        String result = instance.getCourse();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGroup method, of class ScanComment.
     * @throws java.io.IOException
     */
    @Test
    public void testGetGroup() throws IOException {
        System.out.println("getGroup");
        ScanComment instance = new ScanComment();
        String expResult = "A";
        String result = instance.getGroup();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTask method, of class ScanComment.
     * @throws java.io.IOException
     */
    @Test
    public void testGetTask() throws IOException {
        System.out.println("getTask");
        ScanComment instance = new ScanComment();
        String expResult = "Assignment1";
        String result = instance.getTask();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class ScanComment.
     * @throws java.io.IOException
     */
    @Test
    public void testGetName() throws IOException {
        System.out.println("getName");
        ScanComment instance = new ScanComment();
        String expResult = "Lin Dan";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMatric method, of class ScanComment.
     * @throws java.io.IOException
     */
    @Test
    public void testGetMatric() throws IOException {
        System.out.println("getMatric");
        ScanComment instance = new ScanComment();
        String expResult = "898989";
        String result = instance.getMatric();
        assertEquals(expResult, result);
    }
    
}
