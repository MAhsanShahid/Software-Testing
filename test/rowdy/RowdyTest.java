/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rowdy;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gtfghf
 */
public class RowdyTest {
    
    public RowdyTest() {
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
     * Test of main method, of class Rowdy.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Rowdy.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equal method, of class Rowdy.
     */
    @Test
    public void testEqual() {
        System.out.println("equal");
        int[] a = {77,88,9};
        int[] b = {11,4,55};
        boolean expResult = false;
        boolean result = Rowdy.equal(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     public void testEqual2() {
        System.out.println("equal");
        int[] a = {77,88,9};
        int[] b = {11,4,55};
        boolean expResult = true;
        boolean result = Rowdy.equal(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sum method, of class Rowdy.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int[] a = {44,55,6,7,9};
        Rowdy instance = new Rowdy();
        int expResult = 354;
        int result = instance.sum(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testSum2() {
        System.out.println("sum");
        int[] a = {1,2,3,4,5};
        Rowdy instance = new Rowdy();
        int expResult = 15;
        int result = instance.sum(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of arraymultiplily method, of class Rowdy.
     */
    @Test
    public void testArraymultiplily() {
        System.out.println("arraymultiplily");
        int[] a = {2,3,4,5,7};
        Rowdy instance = new Rowdy();
        int expResult = 456;
        int result = instance.arraymultiplily(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
       @Test
    public void testArraymultiplily3() {
        System.out.println("arraymultiplily");
        int[] a = {2,3,4,5,7};
        Rowdy instance = new Rowdy();
        int expResult = 840;
        int result = instance.arraymultiplily(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of addition method, of class Rowdy.
     */
    @Test
    public void testAddition() {
        System.out.println("addition");
        int m = 50;
        int n = 40;
        Rowdy instance = new Rowdy();
        int expResult = 90;
        int result = instance.addition(m, n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of subtraction method, of class Rowdy.
     */
    @Test
    public void testSubtraction() {
        System.out.println("subtraction");
        int m = 10;
        int n = 8;
        Rowdy instance = new Rowdy();
        int expResult = 2;
        int result = instance.subtraction(m, n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class Rowdy.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int s = 30;
        int d = 10;
        Rowdy instance = new Rowdy();
        int expResult = 200;
        int result = instance.multiply(s, d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of linearsearch method, of class Rowdy.
     */
    @Test
    public void testLinearsearch() {
        System.out.println("linearsearch");
        int[] a = {1,2,3,4,5,6,7};
        int key = 5;
        Rowdy instance = new Rowdy();
        boolean expResult = false;
        boolean result = instance.linearsearch(a, key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of vowelcheck method, of class Rowdy.
     */
    @Test
    public void testVowelcheck() {
        System.out.println("vowelcheck");
        char[] a = {'a','b','c','d'};
        Rowdy instance = new Rowdy();
        boolean expResult = false;
        boolean result = instance.vowelcheck(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of capitalcheck method, of class Rowdy.
     */
    @Test
    public void testCapitalcheck() {
        System.out.println("capitalcheck");
        String name = "lahore";
        Rowdy instance = new Rowdy();
        boolean expResult = false;
        boolean result = instance.capitalcheck(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of bestplayer method, of class Rowdy.
     */
    @Test
    public void testBestplayer() {
        System.out.println("bestplayer");
        String name = "ahsan";
        Rowdy instance = new Rowdy();
        boolean expResult = false;
        boolean result = instance.bestplayer(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of nationality method, of class Rowdy.
     */
    @Test
    public void testNationality() {
        System.out.println("nationality");
        String date = "16";
        Rowdy instance = new Rowdy();
        String expResult = "unknown";
        String result = instance.nationality(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
