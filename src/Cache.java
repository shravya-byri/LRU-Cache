import java.util.HashMap;

public class Cache {

    HashMap<Integer,Student> data1 = new HashMap<>();

    public Student fetchFromCache(int roll ) throws InterruptedException {
        return data1.get(roll);
    }
    public void putInCache(Student s) {
        data1.put(s.roll,s);
    }
}
