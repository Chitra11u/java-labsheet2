import java.util.Scanner;

public class Limport java.util.Scanner;

public class Labsheet2Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "secret123";
        String enteredPassword;
        
        do {
            System.out.print("Enter password: ");
            enteredPassword = scanner.nextLine();
        } while (!enteredPassword.equals(correctPassword));
        
        System.out.println("Access granted.");
        scanner.close();
    }
} 
