package io.github.rahulrajsonu.mastercodinginterview.coding.linkedlist.singly;

/**
 * Given a linked list and numbers m and n, return it back with only positions m to n in reverse.
 * Input = 1->2->3->4->5 , m = 2 & n = 4
 * Output = 1->4->3->2->5
 */
public class ReverseSpecificPositionInLinkedList {

    public static Node reverse(Node head, int m, int n) {
        if(null == head || null == head.next){
            return head;
        }
        int counter = 1;
        Node curr = head;
        Node start = head;
        while (counter < m){
            start = curr;
            curr = curr.next;
            counter++;
        }
        Node newList = null;
        Node tail = curr;
        while (counter >= m && counter <= n) {
            Node next = curr.next;
            curr.next = newList;
            newList = curr;
            curr = next;
            counter++;
        }
        start.next = newList;
        tail.next = curr;
        if(m >1){
            return head;
        }else {
            return newList;
        }
    }
}
