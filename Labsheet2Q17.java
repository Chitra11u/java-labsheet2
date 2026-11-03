public class Labsheet2Q17 {
    public static void main(String[] args) {
        int n = 9;
        int rotated = (n << 2) | (n >>> (32 - 2));
        
        System.out.println("Original: " + Integer.toBinaryString(n));
        System.out.println("Rotated left by 2: " + rotated);
    }
}
