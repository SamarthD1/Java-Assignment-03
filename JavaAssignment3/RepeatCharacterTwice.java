public class RepeatCharacterTwice {
    public static void main(String[] args) {
        String str = "Hello";
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            newStr.append(str.charAt(i)).append(str.charAt(i));
        }

        System.out.println("Original String: " + str);
        System.out.println("New String with characters repeated twice: " + newStr.toString());
    }
}
