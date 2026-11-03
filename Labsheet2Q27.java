public class Labsheet2Q27 {
    public static void main(String[] args) {
        char grade = 'B';
        
        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("Excellent");
                break;
            case 'B':
            case 'b':
                System.out.println("Good");
                break;
            case 'C':
            case 'c':
                System.out.println("Average");
                break;
            case 'D':
            case 'd':
                System.out.println("Below Average");
                break;
            case 'F':
            case 'f':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
}
