package com.Bridgelabz;
import java.util.LinkedList;

public class LinkedList2 {
    public static class Node{
        Node next;
        int data;

        public void data(int data) {
            this.data = data;
        }

    }
    private void show() {
        Node newNode1 = new Node();
        newNode1.data(70);

        Node newNode2 = new Node();
        newNode2.data(30);
        newNode1.next = newNode2;

        Node newNode3 = new Node();
        newNode3.data(56);
        newNode2.next = newNode3;

        System.out.println(newNode3.data + "-->" + newNode2.data + "-->" + newNode1.data);


    }


    public static void main(String[] args) {

        System.out.println("my linklist is : ");
        LinkedList2 list = new LinkedList2();
        list.show();

    }


}
