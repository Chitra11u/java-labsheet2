public class Labsheet2Q24 {
    public static void main(String[] args) {
        int[] arr = {15, 8, 42, 23, 4, 16};
        int max = arr[0];
        int min = arr[0];
        
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
