public class WordCount {
    public static void main(String[] args) {
        String str = "This is a Java program to count words.";
        
        String[] words = str.split("\\s+");
        
        int wordCount = words.length;
        
        System.out.println("The number of words in the given string is: " + wordCount);
    }
}
