/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.flooringmasterv2.dao;

import com.swcguild.flooringmasterv2.dao.FloorMasteryDAO;
import com.swcguild.flooringmasterv2.dao.FloorMasteryDAOImpl;
import com.swcguild.flooringmasterv2.dto.Order;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author apprentice
 */
public class FloorMasteryDAOTest {

    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    FloorMasteryDAO dao = ctx.getBean("dao", FloorMasteryDAOImpl.class);

    public FloorMasteryDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() throws FileNotFoundException {
        dao.loadTaxInfoFromFile();
        dao.loadFlooringOptionsFromFile();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAddOrderNull() {
        dao.addOrder("03112016", "Austyn Hill", "IN", 20.0, 15.0, "wood");
        ArrayList<Order> arrayList = dao.displayOrders("03112016");
        Assert.assertNotNull(arrayList);
    }

    @Test
    public void testAddOrderFindProperty() {
        dao.addOrder("03112016", "Austyn Hill", "IN", 20.0, 15.0, "wood");
        ArrayList<Order> arrayList = dao.displayOrders("03112016");
        Order name = arrayList.get(0);
        Assert.assertEquals("Austyn Hill", name.getCustName());
    }

    @Test
    public void testAddOrderMultipleOrderDifferentDate() {
        dao.addOrder("03112016", "Austyn Hill", "IN", 20.0, 15.0, "wood");
        dao.addOrder("03122016", "Bill Kim", "OH", 23.0, 18.0, "carpet");
        ArrayList<Order> arrayList = dao.displayOrders("03112016");
        ArrayList<Order> arrayList2 = dao.displayOrders("03122016");
        Assert.assertNotNull(arrayList);
        Assert.assertNotNull(arrayList2);
    }

    @Test
    public void testAddOrderMultipleOrderSameDate() {
        dao.addOrder("03112016", "Austyn Hill", "IN", 20.0, 15.0, "wood");
        dao.addOrder("03112016", "Bill Kim", "OH", 23.0, 18.0, "carpet");
        ArrayList<Order> arrayList = dao.displayOrders("03112016");
        Assert.assertEquals(2, arrayList.size());

    }

    // hard coded the order number to 1 in order to run this test
    @Test
    public void testEditOrderIsNull() {
        dao.addOrder("03172016", "Austyn Hill", "IN", 20.0, 15.0, "wood");
        Order removedOrder = dao.removeOrder("03172016", 1);
        Order order = dao.editOrder("03172016", 1);
        Assert.assertNull(order);

    }

    @Test
    public void testEditOrderIsNotNull() {
        dao.addOrder("03172016", "Austyn Hill", "IN", 20.0, 15.0, "wood");
        Order order = dao.editOrder("03172016", 1);
        Assert.assertNotNull(order);

    }

    @Test
    public void testRemoveOrderIsNull() {
        dao.addOrder("03172016", "Austyn Hill", "IN", 20.0, 15.0, "wood");
        Order removedOrder = dao.removeOrder("03172016", 1);
        Order twiceRemovedOrder = dao.removeOrder("03172016", 1);
        Assert.assertNull(twiceRemovedOrder);

    }

    @Test
    public void testRemoveOrderIsNotNull() {
        dao.addOrder("03172016", "Austyn Hill", "IN", 20.0, 15.0, "wood");
        Order removedOrder = dao.removeOrder("03172016", 1);
        Assert.assertNotNull(removedOrder);

    }

    @Test
    public void testDisplayOrderTestNotNull() {
        dao.addOrder("03172016", "Austyn Hill", "IN", 20.0, 15.0, "wood");
        ArrayList<Order> orders = dao.displayOrders("03172016");
        Assert.assertNotNull(orders);
    }

    @Test
    public void testToString() {
        dao.addOrder("03172016", "Austyn Hill", "IN", 20.0, 15.0, "wood");
        Order orderToString = dao.removeOrder("03172016", 1);
        String tester = dao.toString(orderToString);
        boolean lazy = (!tester.isEmpty());
        Assert.assertTrue(lazy);
    }
}
