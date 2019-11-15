package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void addTest (){
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        Assert.assertTrue(myList.contains(1));
    }

    @Test
    public void removeTest(){
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.remove(2);
        Assert.assertFalse(myList.contains(2));
    }

    @Test
    public void containsTest(){
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.add(1);
        Assert.assertTrue(myList.contains(1));
    }

    @Test
    public void findTest(){
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        Assert.assertEquals(2, myList.find(3));

    }

    @Test
    public void sizeTest(){
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        Assert.assertEquals(5, myList.size());

    }

    @Test
    public void getTest(){
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        Assert.assertEquals(3, myList.get(2));
    }

    @Test
    public void copyTest() {
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        Assert.assertEquals(3, myList.copy().get(2));
    }
}
