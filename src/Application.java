public class Application {
    public static void main(String[] args) throws InterruptedException {
        MockDataBase db = new MockDataBase();
        Student s = db.fetchFromDb(2);
        s.printDetails();
    }
}
