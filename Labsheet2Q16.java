public class Labsheet2Q16 {
    public static void main(String[] args) {
        int num = 5;
        int power = 3;
        
        int multiplied = num << power;
        int divided = num >> 1;
        
        System.out.println("Multiplied by 2^" + power + ": " + multiplied);
        System.out.println("Divided by 2: " + divided);
    }
}
