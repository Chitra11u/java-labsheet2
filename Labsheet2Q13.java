public class Labsheet2Q13 {
    public static void main(String[] args) {
        char ch = 'e';
        
        String result = (ch >= '0' && ch <= '9') ? "Digit" :
                        ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) ? 
                            ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                              ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ? "Vowel" : "Consonant") :
                        "Special Symbol";
        
        System.out.println("The character '" + ch + "' is a " + result);
    }
}
