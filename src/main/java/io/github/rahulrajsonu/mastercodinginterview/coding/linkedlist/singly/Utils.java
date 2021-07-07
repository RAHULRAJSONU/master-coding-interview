package io.github.rahulrajsonu.mastercodinginterview.coding.linkedlist.singly;

public class Utils {

    public static Node construct(int[] vals) {
        Node head = new Node(-1);
        Node temp = head;
        for (int val : vals) {
            head.next = new Node(val);
            head = head.next;
        }
        return temp.next;
    }

    public static void print (Node head) {
        if(null==head)return;
        System.out.print(head.val);
        if(null != head.next)System.out.print("->");
        print(head.next);
    }

    public static boolean match (Node n1, Node n2) {
        if(null == n1 && null == n2) return Boolean.TRUE;
        if(n1 != null && n2 != null){
            System.out.println(n1.val+" -> "+n2.val);
            return (n1.val==n2.val) && match(n1.next,n2.next);
        }
        return Boolean.FALSE;
    }
}
