public class Labsheet2Q28 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            int sqrt = (int) Math.sqrt(i);
            if (sqrt * sqrt == i) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
