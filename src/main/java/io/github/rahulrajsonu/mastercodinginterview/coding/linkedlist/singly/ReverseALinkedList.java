package io.github.rahulrajsonu.mastercodinginterview.coding.linkedlist.singly;

/**
 * Given a singly linked list, reverse it
 * eg; input = 1->2->3->4->5->6 | output = 6->5->4->3->2->1
 */
public class ReverseALinkedList {

    public static Node reverse(Node head) {
        if(null==head || null==head.next)return head;
        Node curr = head;
        Node prev = null;
        while (null != curr) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
