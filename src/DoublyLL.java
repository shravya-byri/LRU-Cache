public class DoublyLL {

        public static class Node{
           int data;
           Node next;
           Node prev;
         public Node(int r, Node p, Node n) {
            data = r;
            prev = p;
            next = n;
            }
    }
    public static Node insertAtBack(Node head, int data) {
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
    public static Node insertAtFront(Node head, int data){
            if (head == null) return new Node(data,null,null);
            else {
                Node current2 = head;
                head = new Node(data, null, current2);
                return head;
            }
    }
    public static Node deleteNodeAndAddFront(Node head, int data) {
            Node current = head;
            Node current1 = null;
            if (head == null) {
                return null;
            } else {
                while (current.next.data != data) {
                    current = current.next;
                }
                current1 = current.next;
                current.next = current.next.next;
            }

            head = insertAtFront(head,current1.data);

            return head;

    }
    public static void printDLL(Node head) {
            if (head == null) {
                System.out.println("Doubly linked list doesn't exists");
            } else {
                Node current = head;
                while (current != null) {
                    System.out.print(current.data + " ");
                    current = current.next;
                }
            }
            System.out.println();
    }
    public static void main(String[] args) {
        Node head = null;
        head = insertAtBack(head,2);
        head =  insertAtBack(head,3);
        head = insertAtBack(head,9);
        head =  insertAtBack(head,4);
        head =  insertAtFront(head,8);
        head =  insertAtFront(head,100);
        printDLL(head);
        head = deleteNodeAndAddFront(head,9);
        printDLL(head);
      // System.out.println(deleteNodeAndAddFront(head,9).data);
    }


}
