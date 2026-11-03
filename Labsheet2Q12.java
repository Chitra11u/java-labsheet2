public class Labsheet2Q12 {
    public static void main(String[] args) {
        int a = 12, b = 5, c = 19, d = 8;
        
        int smallest = (a < b) ? ((a < c) ? ((a < d) ? a : d) : ((c < d) ? c : d)) 
                               : ((b < c) ? ((b < d) ? b : d) : ((c < d) ? c : d));
        
        System.out.println("The smallest number is: " + smallest);
    }
}
