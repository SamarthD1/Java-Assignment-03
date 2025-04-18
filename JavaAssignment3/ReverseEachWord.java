public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Java is fun";
        
        String[] words = str.split(" ");
        
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            result.append(reversedWord.reverse().toString()).append(" ");
        }
        
        System.out.println("String with each word reversed: " + result.toString().trim());
    }
}
