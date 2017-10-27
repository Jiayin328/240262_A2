/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum._a2;

import static com.uum._a2.ListFiles.list;
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
public class ListFilesTest {
    
    public ListFilesTest() {
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
     * Test of listFiles method, of class ListFiles.
     */
    @Test
    public void testListFiles() {
        System.out.println("listFiles");
        String PATH = "E:\\Online Learning\\Sem 5\\STIW3054 Real-Time Programming\\Assignment2\\Asg2\\Assignment2_TestFiles";
        ListFiles instance = new ListFiles();
        String expResult = instance.PATH + "\\" + list.get(0);
        String result = ListFiles.listFiles(PATH);
        assertEquals(expResult, result);
    }
    
}
