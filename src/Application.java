public class Application {
    public static void main(String[] args) throws InterruptedException {
        MockAPI api = new MockAPI();
        api.fetchStudentDetails(1).printDetails();
        api.fetchStudentDetails(2).printDetails();
        api.fetchStudentDetails(3).printDetails();
        api.fetchStudentDetails(4).printDetails();
        api.fetchStudentDetails(3).printDetails();
        api.fetchStudentDetails(4).printDetails();
        api.fetchStudentDetails(5).printDetails();
    }
}
