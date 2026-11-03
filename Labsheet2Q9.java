import java.util.Scanner;

public class Labsheet2Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        int len1 = str1.length();
        int len2 = str2.length();
        int minLen = len1 < len2 ? len1 : len2;
        int result = 0;
        for (int i = 0; i < minLen; i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if (c1 != c2) {
                result = c1 - c2;
                break;
            }
        }
        if (result == 0) {
            result = len1 - len2;
        }
        if (result < 0) {
            System.out.println(str1 + " comes before " + str2);
        } else if (result > 0) {
            System.out.println(str2 + " comes before " + str1);
        } else {
            System.out.println("Both strings are equal");
        }
    }
}
