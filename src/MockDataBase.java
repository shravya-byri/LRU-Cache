import java.util.HashMap;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class MockDataBase {
    HashMap<Integer, Student> data = new HashMap<>();
    public MockDataBase() {
        data.put(1, new Student("shravya",1,98));
        data.put(2,new Student("Teja",2,77));
        data.put(3,new Student("Dillu",3,67));
        data.put(4,new Student("Binnu",4,78));
        data.put(5,new Student("Vasantha",5,88));
        data.put(6, new Student("Prabhakar",6,90));
        data.put(7,new Student("Srinija",7,92));
        data.put(8,new Student("Sam",8,92));
        data.put(9, new Student("Pam",9,65));
    }

    public Student fetchFromDb(int roll) throws InterruptedException {
        System.out.println("Waiting for db...");
        Thread.sleep(3000);
        System.out.println("Fetched from db: " + roll);
        return data.get(roll);
    }

}
