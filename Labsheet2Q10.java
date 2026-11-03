public class Labsheet2Q10 {
    public static void main(String[] args) {
        int year = 2024;
        int startRange = 2000;
        int endRange = 2030;
        
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        boolean inRange = (year >= startRange && year <= endRange);
        
        if (isLeap && inRange) {
            System.out.println("The year is both a leap year and within the given range.");
        } else {
            System.out.println("The year does not satisfy both conditions.");
        }
    }
}
