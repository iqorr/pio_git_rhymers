package edu.kis.vh.nursery.list;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntLinkedListTest {

    private IntLinkedList list;

    @Before
    public void setup() {
        list = new IntLinkedList();
    }

    @Test
    public void testPush() {
        int testValue = 4;
        list.push(testValue);
        Assert.assertFalse(list.isEmpty());
        Assert.assertEquals(testValue, list.top());
    }

    @Test
    public void testIsEmpty() {
        Assert.assertTrue(list.isEmpty());
        list.push(1);
        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void testIsFull() {
        Assert.assertFalse(list.isFull());
        for (int i = 0; i < 100; i++) {
            list.push(i);
        }
        Assert.assertFalse(list.isFull());
    }

    @Test
    public void testTop() {
        final int EMPTY = -1;
        Assert.assertEquals(EMPTY, list.top());

        int firstValue = 10;
        list.push(firstValue);
        Assert.assertEquals(firstValue, list.top());

        int secondValue = 20;
        list.push(secondValue);
        Assert.assertEquals(secondValue, list.top());
        Assert.assertEquals(secondValue, list.top());
    }

    @Test
    public void testPop() {
        final int EMPTY = -1;
        Assert.assertEquals(EMPTY, list.pop());

        int firstValue = 10;
        list.push(firstValue);
        int secondValue = 20;
        list.push(secondValue);

        Assert.assertEquals(secondValue, list.pop());
        Assert.assertEquals(firstValue, list.pop());
        Assert.assertEquals(EMPTY, list.pop()); 
    }
}
