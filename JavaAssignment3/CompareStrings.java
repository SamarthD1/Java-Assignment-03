public class CompareStrings {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = "helloworld";

        int result = str1.compareToIgnoreCase(str2);

        if (result == 0) {
            System.out.println("The strings are equal, ignoring case.");
        } else if (result > 0) {
            System.out.println("The first string is lexicographically greater than the second string.");
        } else {
            System.out.println("The first string is lexicographically smaller than the second string.");
        }
    }
}
