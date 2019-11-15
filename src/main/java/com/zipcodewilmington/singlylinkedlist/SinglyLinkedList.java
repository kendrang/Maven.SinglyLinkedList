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
        while (current.next != null) {
            current = current.next;
            if (current.next.data == data) {
                return true;
            }
        }return false;
    }


}