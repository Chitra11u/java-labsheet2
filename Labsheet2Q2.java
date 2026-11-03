import java.util.Scanner;

public class Labsheet2Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal = scanner.nextDouble();
        double rate = scanner.nextDouble();
        double time = scanner.nextDouble();
        double amount = principal * Math.pow(1 + rate / 100.0, time);
        double compoundInterest = amount - principal;
        System.out.println(compoundInterest);
    }
}
