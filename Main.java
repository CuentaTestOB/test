package ReverseLinkedList;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        public static void main(String args[]) {
            ReverseLink linkedlist = getDefaultList();
            System.out.println("linked list before reversing : " + linkedlist);
            linkedlist.reverseIteratively();
            System.out.println("linked list after reversing : " + linkedlist);
            linkedlist.reverseRecursively();
            System.out.println("linked list after reversing recursively: "
                    + linkedlist);

        }

        private static ReverseLink getDefaultList(){
            ReverseLink linkedlist = new ReverseLink();
            linkedlist.append("A"); linkedlist.append("B"); linkedlist.append("C");
            linkedlist.append("D"); linkedlist.append("E"); linkedlist.append("F");
            return linkedlist;
        }
}
