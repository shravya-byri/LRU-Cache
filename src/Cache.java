import java.util.HashMap;

public class Cache {


    HashMap<Integer,DoublyLL.Node> cacheData = new HashMap<>();
    DoublyLL.Node head = null;

    public Student getFromCache(int roll) {
        if (cacheData.containsKey(roll)) {
            System.out.println("Fetching from cache" + roll);
            DoublyLL.Node fetched = cacheData.get(roll);
            DoublyLL.deleteNodeAndAddFrontWhenNodeAvailable(head, fetched);
            return fetched.student;
        } else {
            return null;
        }
    }
    public void putInCache(Student s) {
        head = DoublyLL.insertAtFront(head, s);
        cacheData.put(s.roll, head);
        head = DoublyLL.insertAtFront(head, s);
        System.out.println("Inserted in cache :" + s.roll);

    }

}
