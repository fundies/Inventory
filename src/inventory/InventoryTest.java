/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Greg Williamson
 * @version 0.1
 */
public class InventoryTest {

    /**
     * Default Constructor.
     */
    public InventoryTest() {
        // webcat stop your bitching pls...
    }

    /**
     * Test of getName method, of class Inventory.
     */
    @Test
    public final void testGetName() {
        System.out.println("getName");
        Inventory instance = new Inventory();
        instance.setName("herpderp");
        assertEquals("herpderp", instance.getName());
    }

    /**
     * Test of getPrice method, of class Inventory.
     */
    @Test
    public final void testGetPrice() {
        System.out.println("getPrice");
        Inventory instance = new Inventory("k", 1, 0);
        assertEquals(1, instance.getPrice(), 0.001);
    }

    /**
     * Test of getQuantity method, of class Inventory.
     */
    @Test
    public final void testGetQuantity() {
        System.out.println("getQuantity");
        Inventory instance = new Inventory("k", 1, 7);
        assertEquals(7, instance.getQuantity());
    }

    /**
     * Test of setName method, of class Inventory.
     */
    @Test
    public final void testSetName() {
        System.out.println("setName");
        Inventory instance = new Inventory();
        instance.setName("wat");
        assertEquals(instance.getName(), "wat");
    }

    /**
     * Test of setPrice method, of class Inventory.
     */
    @Test
    public final void testSetPrice() {
        System.out.println("setPrice");
        Inventory instance = new Inventory();
        instance.setPrice(2.00);
        assertEquals(instance.getPrice(), 2.00, 0.001);
    }

    /**
     * Test of setQuantity method, of class Inventory.
     */
    @Test
    public final void testSetQuantity() {
        System.out.println("setQuantity");
        Inventory instance = new Inventory();
        instance.setQuantity(8);
        assertEquals(8, instance.getQuantity());
    }

    /**
     * Test of sold method, of class Inventory.
     */
    @Test
    public final void testSold() {
        System.out.println("sold");
        Inventory instance = new Inventory("things", 1.00, 4);

        instance.sold(1);
        assertEquals(instance.getQuantity(), 3);

        instance.sold(2);
        assertEquals(instance.getQuantity(), 1);

        instance.sold(2);
        assertEquals(instance.getQuantity(), 1);

    }

}
