import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10, 20, 30, 40, 50};
        int[] newArray = new int[array.length - 1];
        System.out.print("Enter the element to remove: ");
        int element = scanner.nextInt();
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != index) {
                    newArray[j++] = array[i];
                }
            }
            for (int num : newArray) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Element not found.");
        }
        scanner.close();
    }
}
