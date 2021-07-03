public class MockAPI {
    MockDataBase db = new MockDataBase();
    Cache c = new Cache();
   public Student fetchStudentDetails(int roll) throws InterruptedException {
       Student result = c.getFromCache(roll);
       if (result != null ) {
           System.out.println("Cache Hit: " + roll);
       } else {
           System.out.println("Cache Miss: " + roll);
           result = db.fetchFromDb(roll);
           c.putInCache(result);
       }
       return result;
   }
}
