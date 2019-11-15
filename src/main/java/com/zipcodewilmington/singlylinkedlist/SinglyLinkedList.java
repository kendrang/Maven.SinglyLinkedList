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

    public void remove(int index) {
        if (index == 0) {
            head = head.next;
        }
        else {
            Node current = head;
            for (int i = 0;i < index - 1 ; i++){
                current = current.next;
            }
            current.next = current.next.next;
        }
    }

    public boolean contains(int data) {
        Node current = head;
        if (current.data == data) {
            return true;
        }
        while (current.next != null) {
            if (current.next.data == data || current.data == data) {
                return true;
            }
            current = current.next;
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

    public int size() {
        int counter = 0;
        Node current = head;
        while (current != null) {
            counter++;
            current = current.next;
        }
        return counter;
    }

    public int get(int index) {
        int counter = 0;
        Node current = head;
        if (index == 0){
            return current.data;
        }
        while (current.next != null) {
            current = current.next;
            counter++;
            if (counter == index) {
                break;
            }
        }
        return current.data;
    }

    public SinglyLinkedList copy() {
        SinglyLinkedList copyList = new SinglyLinkedList();
        Node current = head;
        while (current != null) {
            copyList.add(current.data);
            current = current.next;
        }
        return copyList;
    }

    public void sort() {
        SinglyLinkedList sorted = new SinglyLinkedList();

        int sizeForLoop = this.size();

        for (int i = 0; i < sizeForLoop; i++){

            int smallest = head.data;
            Node current = head;

            while (current != null) {
                if (current.data < smallest) {
                    smallest = current.data;
                }current = current.next;
            }
            sorted.add(smallest);
            this.remove(this.find(smallest));
        } this.head = sorted.head;
    }
}