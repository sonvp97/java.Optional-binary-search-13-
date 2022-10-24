import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter element %s: ", i);
            int num = scanner.nextInt();
            scanner.nextLine();
            array[i] = num;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        System.out.println("Enter the number to check: ");
        int num = scanner.nextInt();scanner.nextLine();
        System.out.println(binarySearch(array,0,array.length-1,num));
    }

    static int binarySearch(int[] array, int left, int right, int value) {
        int middle = (left + right) / 2;
        while (right >= left) {
            if (array[middle] == value) return middle;
            else if (value > array[middle]) left = middle + 1;
            else right = middle - 1;
        }
        return -1;
    }
}