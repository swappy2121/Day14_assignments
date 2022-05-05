package com.Bridgelabz;

public class LinkedList {

    public static ListNode head;

    public static class ListNode {
        ListNode next;
        int data;

        public void Node(int data) {

            ListNode node = new ListNode();
            node.data = data;
            node.next = null;

            if (head == null) {
                head = node;
            } else {
                ListNode n = head;
                while (n.next != null) {
                    n = n.next;
                }
                n.next = node;
            }
        }
    }


    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
    }




    public static void main(String[] args) {

        ListNode list = new ListNode();
        list.Node(56);
        list.Node(30);
        list.Node(70);

        LinkedList show = new LinkedList();
        show.display();

    }

    }

