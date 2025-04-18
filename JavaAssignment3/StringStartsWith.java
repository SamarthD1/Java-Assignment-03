public class StringStartsWith {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = "Hello";

        if (str1.startsWith(str2)) {
            System.out.println("The first string starts with the second string.");
        } else {
            System.out.println("The first string does not start with the second string.");
        }
    }
}
