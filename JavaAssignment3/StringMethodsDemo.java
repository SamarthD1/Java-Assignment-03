public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // 1. int length()
        System.out.println("Length of string: " + str.length());

        // 2. char charAt(int index)
        System.out.println("Character at index 4: " + str.charAt(4));

        // 3. int indexOf(int ch)
        System.out.println("Index of character 'o': " + str.indexOf('o'));

        // 4. int indexOf(int ch, int fromIndex)
        System.out.println("Index of character 'o' starting from index 5: " + str.indexOf('o', 5));

        // 5. int indexOf(String substring)
        System.out.println("Index of substring 'World': " + str.indexOf("World"));

        // 6. int indexOf(String substring, int fromIndex)
        System.out.println("Index of substring 'o' starting from index 5: " + str.indexOf("o", 5));

        // 7. lastIndexOf()
        System.out.println("Last index of character 'o': " + str.lastIndexOf('o'));

        // 8. String substring(int beginIndex)
        System.out.println("Substring from index 7: " + str.substring(7));

        // 9. String substring(int beginIndex, int endIndex)
        System.out.println("Substring from index 7 to 12: " + str.substring(7, 12));

        // 10. boolean contains(CharSequence s)
        System.out.println("Does the string contain 'World': " + str.contains("World"));

        // 11. String concat(String s)
        System.out.println("Concatenated string: " + str.concat(" Welcome!"));

        // 12. boolean equals(Object o)
        System.out.println("Does the string equal 'Hello, World!': " + str.equals("Hello, World!"));

        // 13. boolean equalsIgnoreCase(String s)
        System.out.println("Does the string equal 'hello, world!' ignoring case: " + str.equalsIgnoreCase("hello, world!"));

        // 14. boolean isEmpty()
        System.out.println("Is the string empty: " + str.isEmpty());

        // 15. boolean equals(Object o) (already demonstrated above)
        // (Same as point 12)

        // 16. boolean equalsIgnoreCase(String s) (already demonstrated above)
        // (Same as point 13)

        // 17. String toLowerCase()
        System.out.println("String in lowercase: " + str.toLowerCase());

        // 18. String toUpperCase()
        System.out.println("String in uppercase: " + str.toUpperCase());

        // 19. int compareTo(String anotherString)
        System.out.println("Comparing 'Hello, World!' with 'Hello, world!': " + str.compareTo("Hello, world!"));

        // 20. int compareToIgnoreCase(String anotherString)
        System.out.println("Comparing 'Hello, World!' with 'hello, world!' ignoring case: " + str.compareToIgnoreCase("hello, world!"));

        // 21. String trim()
        String strWithSpaces = "   Hello, World!   ";
        System.out.println("Trimmed string: '" + strWithSpaces.trim() + "'");

        // 22. String replace(char oldChar, char newChar)
        System.out.println("String after replacing 'o' with '0': " + str.replace('o', '0'));

        // 23. char[] toCharArray()
        char[] charArray = str.toCharArray();
        System.out.print("String to char array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 24. boolean startsWith(String s)
        System.out.println("Does the string start with 'Hello': " + str.startsWith("Hello"));

        // 25. boolean endsWith(String s)
        System.out.println("Does the string end with 'World!': " + str.endsWith("World!"));

        // 26. static String join(CharSequence delim, CharSequence... strs)
        String joinedString = String.join(", ", "Apple", "Banana", "Cherry");
        System.out.println("Joined string: " + joinedString);
    }
}
