public class Labsheet2Q21 {
    public static void main(String[] args) {
        int number = 36;
        int i = 1;
        
        System.out.print("Factors of " + number + ": ");
        do {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= number);
    }
}
