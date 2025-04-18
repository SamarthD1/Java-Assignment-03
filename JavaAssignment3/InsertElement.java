import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[6];
        int[] original = {10, 20, 30, 40, 50};
        System.arraycopy(original, 0, array, 0, original.length);

        System.out.print("Enter the element to insert: ");
        int element = scanner.nextInt();
        System.out.print("Enter the position to insert (0-5): ");
        int position = scanner.nextInt();

        for (int i = array.length - 1; i > position; i--) {
            array[i] = array[i - 1];
        }

        array[position] = element;

        for (int num : array) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
