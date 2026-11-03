public class Labsheet2Q25 {
    public static void main(String[] args) {
        int[][] marks = {
            {85, 90, 78},
            {92, 88, 95},
            {76, 80, 82}
        };
        
        double totalSum = 0;
        int totalElements = 0;
        
        for (int[] studentMarks : marks) {
            for (int mark : studentMarks) {
                totalSum += mark;
                totalElements++;
            }
        }
        
        double average = totalSum / totalElements;
        System.out.println("Average marks of all students: " + average);
    }
}
