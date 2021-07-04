import java.util.HashMap;

public class Cache {
    HashMap<Integer,DoublyLL.Node> cacheData = new HashMap<>();
//    DoublyLL.Node head = null;
//    DoublyLL.Node tail = null;
    DoublyLL.Tead tead = new DoublyLL.Tead(null, null);
    int CACHE_LIMIT = 3;
    public Student getFromCache(int roll) {
        if (cacheData.containsKey(roll)) {
            System.out.println("Fetching from cache" + roll);
            DoublyLL.Node fetched = cacheData.get(roll);
            tead = DoublyLL.deleteNodeAndAddFrontWhenNodeAvailable(tead.head, tead.tail, fetched);
            return fetched.student;
        } else {
            return null;
        }
    }
    public void putInCache(Student s) {
        if (cacheData.size() == CACHE_LIMIT) {
            // delete Last Node
            System.out.println("Cache full, evicting roll: " + tead.tail.student.roll);
            cacheData.remove(tead.tail.student.roll);
            tead.tail = tead.tail.prev;
            tead.tail.next = null;
            // maintain tail pointer
        }
        tead = DoublyLL.insertAtFront(tead.head, tead.tail, s);
        cacheData.put(s.roll, tead.head);
        System.out.println("Inserted in cache :" + s.roll);

    }

}
