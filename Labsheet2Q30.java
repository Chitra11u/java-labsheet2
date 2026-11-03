public class Labsheet2Q30 {
    public static void main(String[] args) {
        int number = 16;
        
        int temp = number;
        while (temp > 1 && (temp & 3) == 0) {
            temp >>= 2;
        }
        boolean isPowerOf4 = (temp == 1 && number > 0);
        System.out.println(number + " is a power of 4: " + isPowerOf4);
        
        int toggled = number ^ (1 << 3);
        System.out.println("Number after toggling 3rd bit: " + toggled);
        
        System.out.print("Multiplication table: ");
        for (int i = 1; i <= 20; i++) {
            int product = number * i;
            
            if (product > 0 && product % 48 == 0) {
                break;
            }
            
            if (product % 6 == 0) {
                continue;
            }
            
            System.out.print(product + " ");
        }
    }
}
