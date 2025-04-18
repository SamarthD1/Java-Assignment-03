import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();
        int low = 0, high = array.length - 1, mid;
        boolean found = false;

        while (low <= high) {
            mid = (low + high) / 2;
            if (array[mid] == key) {
                System.out.println("Element found at index: " + mid);
                found = true;
                break;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }
        scanner.close();
    }
}
