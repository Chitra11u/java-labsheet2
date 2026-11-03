import java.util.Scanner;

public class Labsheet2Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        int steps = 0;
        while (num >= 1) {
            num /= 2.0;
            steps++;
        }
        System.out.println(steps);
    }
}
