import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagrams.");
        } else {
            
            char[] str1Array = str1.toCharArray();
            char[] str2Array = str2.toCharArray();
            
            Arrays.sort(str1Array);
            Arrays.sort(str2Array);
            
            if (Arrays.equals(str1Array, str2Array)) {
                System.out.println("The strings are anagrams.");
            } else {
                System.out.println("The strings are not anagrams.");
            }
        }
    }
}
