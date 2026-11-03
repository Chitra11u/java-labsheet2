public class Labsheet2Q19 {
    public static void main(String[] args) {
        System.out.print("Armstrong numbers between 1 and 1000: ");
        for (int i = 1; i <= 1000; i++) {
            int sum = 0, digits = 0;
            int t = i;
            
            while (t > 0) {
                digits++;
                t /= 10;
            }
            
            t = i;
            while (t > 0) {
                int rem = t % 10;
                int prod = 1;
                for (int j = 0; j < digits; j++) {
                    prod *= rem;
                }
                sum += prod;
                t /= 10;
            }
            
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}
