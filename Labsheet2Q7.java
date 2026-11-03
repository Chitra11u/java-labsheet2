import java.util.Scanner;

public class import java.util.Scanner;

public class Labsheet2Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalRainfall = 0;
        for (int i = 0; i < 7; i++) {
            double rainfall = scanner.nextDouble();
            totalRainfall += rainfall;
        }
        System.out.println(totalRainfall);
    }
} 
