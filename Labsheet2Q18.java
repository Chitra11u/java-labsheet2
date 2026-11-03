public class Labsheet2Q18 {
    public static void main(String[] args) {
        int n = 20;
        long t1 = 0, t2 = 1;
        
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " ");
            long sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
