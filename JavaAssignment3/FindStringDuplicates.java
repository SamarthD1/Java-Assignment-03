import java.util.HashSet;

public class FindStringDuplicates {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "orange", "apple", "grape", "banana"};
        HashSet<String> set = new HashSet<>();

        System.out.println("Duplicate values:");
        for (String str : array) {
            if (!set.add(str)) {
                System.out.println(str);
            }
        }
    }
}
