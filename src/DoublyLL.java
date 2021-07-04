import java.util.HashMap;

public class DoublyLL {

    public static class Node{
       Student student;
       Node next;
       Node prev;
       public Node(Student r, Node p, Node n) {
        student = r;
        prev = p;
        next = n;
       }
    }

    public static class Tead {
        Node head;
        Node tail;
        public Tead(Node h, Node t) {
            head = h;
            tail = t;
        }
    }

    public static Node insertAtBack(Node head, Student data) {
            Node current1 = head;
            if (head == null)
                return new Node(data,null,null);
            else {
                while(current1.next != null) {
                    current1 = current1.next;
                }
                current1.next = new Node(data, current1, null);
                return head;
            }

    }
    public static Tead insertAtFront(Node head, Node tail, Student studentData){
            if (head == null) {
                Node newHead = new Node(studentData,null,null);
                return new Tead(newHead, newHead);
            }
            else {
                Node current2 = head;
                head = new Node(studentData, null, current2);
                current2.prev = head;
                return new Tead(head, tail);
            }
    }

    public static Tead deleteNodeAndAddFrontWhenNodeAvailable(Node head, Node tail, Node deleteNode) {
            if (deleteNode.prev == null) {
                return new Tead(head, head);
            } else {
                if (deleteNode == tail) {
                    tail = tail.prev;
                }
                Node prev = deleteNode.prev;
                prev.next = prev.next.next;
                prev.next.prev = prev;
                return insertAtFront(head, tail, deleteNode.student);
            }

    }
//    public static Node deleteNodeAndAddFront(Node head, Student data) {
//            Node current = head;
//            Node current1 = null;
//            if (head == null) {
//                return null;
//            } else {
//                while (current.next.student != data) {
//                    current = current.next;
//                }
//                current1 = current.next;
//                current.next = current.next.next;
//            }
//
//            head = insertAtFront(head,current1.student);
//
//            return head;
//
//    }
    public static void printDLL(Node head) {
            if (head == null) {
                System.out.println("Doubly linked list doesn't exists");
            } else {
                Node current = head;
                while (current != null) {
                    System.out.print(current.student.name + " "+ current.student.roll+ " " + current.student.marks);
                    System.out.println();
                    current = current.next;
                }
            }

    }
    public static void main(String[] args) {
        Node head = null;
        MockDataBase db = new MockDataBase();
        HashMap<Integer, Student> hm = db.data;
        head =  insertAtBack(null, hm.get(1));
        head =  insertAtBack(head, hm.get(3));
        printDLL(head);
       // head = deleteNodeAndAddFrontWhenNodeAvailable(head,hm.get(1));
        //printDLL(head);
      // System.out.println(deleteNodeAndAddFront(head,9).data);
    }


}
