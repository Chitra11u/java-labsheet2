public class Labsheet2Q15 {
    public static void main(String[] args) {
        int n = 29;
        int count = 0;
        int temp = n;
        
        while (temp > 0) {
            count += (temp & 1);
            temp >>= 1;
        }
        
        System.out.println("Number of set bits in " + n + " is: " + count);
    }
}
