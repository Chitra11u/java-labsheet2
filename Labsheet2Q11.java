public class Labsheet2Q11 {
    public static void main(String[] args) {
        double theory = 45.0;
        double practical = 55.0;
        double overall = 48.0;
        
        boolean passed = (theory >= 40.0 && practical >= 50.0) || (overall >= 50.0);
        
        if (passed) {
            System.out.println("Student passes the course.");
        } else {
            System.out.println("Student fails the course.");
        }
    }
}
