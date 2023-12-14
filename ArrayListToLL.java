/* package whatever; // don't place package name! */


// You are given the heads of two sorted linked lists list1 and list2.

// Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

// Return the head of the merged linked list.

import java.util.*;

public class ArrayListToLL {

    public static class Node {
        int data;
        Node next;
    }

    public Node mergeLinkedList(Node LL1, Node LL2) {
        List<Integer> list = new ArrayList<>();

        Node temp1 = LL1;
        while (temp1 != null) {
            list.add(temp1.data);
            temp1 = temp1.next;
        }

        Node temp2 = LL2;
        while (temp2 != null) {
            list.add(temp2.data);
            temp2 = temp2.next;
        }

        Collections.sort(list);

        // List<Integer> linkedList = new LinkedList<>();

        // for (Integer val : list) {
        //     linkedList.add(val);
        // }

        Node head = convertListToLinkedList(list);

        return head;
    }

    public static void main(String args[]) {
        List<Integer> LL1 = new LinkedList<>();
        List<Integer> LL2 = new LinkedList<>();

        LL1.add(2);
        LL1.add(5);
        LL1.add(7);

        LL2.add(3);
        LL2.add(4);
        LL2.add(6);

        ArrayListToLL arrayListToLL = new ArrayListToLL();
        Node result = arrayListToLL.mergeLinkedList(convertListToLinkedList(LL1), convertListToLinkedList(LL2));

        // Print the result or process it as needed
        printLinkedList(result);
    }

    private static Node convertListToLinkedList(List<Integer> list) {
        Node head = null;
        Node tail = null;

        for (int val : list) {
            Node newNode = new Node();
            newNode.data = val;
            newNode.next = null;

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }

    private static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
