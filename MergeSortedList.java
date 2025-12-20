
import java.io.*;

public class MergeSortedList {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class MyLinkedList {

        Node head;

        void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;

        }

        void display() {
            StringBuilder sb = new StringBuilder();
            Node temp = head;
            while (temp.next != null) {
                sb.append(temp.data).append(" ");
                temp = temp.next;
            }
            sb.append(temp.data);
            System.out.println(sb.toString());
        }

        void merge(MyLinkedList list1, MyLinkedList list2) {
            Node p1=list1.head;
            Node p2=list2.head;


            while (p1 != null && p2 != null) {
                if (p1.data < p2.data) {
                    this.add(p1.data);
                    p1 = p1.next;

                } else {
                    this.add(p2.data);
                    p2 = p2.next;
                }
            }
            while (p1 != null) {
                this.add(p1.data);
                p1 = p1.next;
            }
            while (p2 != null) {
                this.add(p2.data);
                p2 = p2.next;
            }

        }

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MyLinkedList list1 = new MyLinkedList();
        MyLinkedList list2 = new MyLinkedList();
        MyLinkedList mergedList = new MyLinkedList();
        list1.add(1);
        list1.add(3);
        list1.add(4);
        list2.add(1);
        list2.add(2);
        list2.add(4);
        list1.display();
        list2.display();
        mergedList.merge(list1, list2);
        mergedList.display();
    }
}
