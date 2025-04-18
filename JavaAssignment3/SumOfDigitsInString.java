public class SumOfDigitsInString {
    public static void main(String[] args) {
        String str = "abc123def45";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }

        System.out.println("Sum of digits in the string: " + sum);
    }
}
