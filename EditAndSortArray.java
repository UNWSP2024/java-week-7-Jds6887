package my2;

import java.util.Scanner;
import java.util.Arrays;

public class EditAndSortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20];
        int count = 0;

        System.out.println("Enter up to 20 integers (type 'done' when finished):");
        while (count < 20) {
            if (scanner.hasNextInt()) {
                numbers[count] = scanner.nextInt();
                count++;
            } else if (scanner.hasNext("done")) {
                break;
            } else {
                System.out.println("Please enter a valid integer or 'done' to finish.");
                scanner.next(); // Clear invalid input
            }
        }

        String editChoice;
        do {
            System.out.println("Current numbers: " + Arrays.toString(Arrays.copyOf(numbers, count)));
            System.out.print("Would you like to edit a number? (yes/no): ");
            editChoice = scanner.next();

            if (editChoice.equalsIgnoreCase("yes")) {
                System.out.print("Enter index of number to edit (0 - " + (count - 1) + "): ");
                int index = scanner.nextInt();
                
                if (index >= 0 && index < count) {
                    System.out.print("Enter new value: ");
                    numbers[index] = scanner.nextInt();
                } else {
                    System.out.println("Invalid index.");
                }
            }
        } while (editChoice.equalsIgnoreCase("yes"));

        Arrays.sort(numbers, 0, count); // Sort only the filled part of the array
        System.out.println("Sorted numbers: " + Arrays.toString(Arrays.copyOf(numbers, count)));
        
        scanner.close(); // Close the scanner resource
    }
}