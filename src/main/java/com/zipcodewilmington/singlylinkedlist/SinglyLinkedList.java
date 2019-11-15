package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {

    Node head;

    private class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    public void add(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;

            }
            n.next = new Node(data);
        }
    }

    public void remove(int data) {
        Node current = head;
        if (head.data == data) {
            head = head.next;
        }
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public boolean contains(int data) {
        Node current = head;
        if (current.data == data){
            return true;
        }
        while (current.next != null ) {
            if (current.next.data == data || current.data == data) {
                return true;
            }current = current.next;
        }
        return false;
    }

    public int find(int data) {
        int counter = 0;
        Node current = head;
        while (current != null) {
            if (current.data == data)
                return counter;
                counter++;
                current = current.next;
        }
        return counter;
    }

    public int get(int index) {
        int counter = 0;
        Node current = head;
        while (current.next != null) {
            current = current.next;
            counter++;
            if (counter == index) {
                counter++;
                break;
            }
        }return counter;
    }
}