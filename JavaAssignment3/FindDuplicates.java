public class FindDuplicates {
    public static void main(String[] args) 
    {
        int[] array = {10, 20, 30, 20, 40, 50, 10};
        System.out.println("Duplicate values:");

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                    break;
                }
            }
        }
    }
}
