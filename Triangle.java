package Pascal;

public class Triangle {
    public static void main(String[] args) {
        // Step 1: Declare a 2D array
        int[][] pascal = new int[11][11];

        // Step 2: Initialize the triangle
        for (int i = 0; i < 11; i++) {
            pascal[i][0] = 1; // First element of each row
            pascal[i][i] = 1; // Last element of each row
        }

        // Step 3: Compute values for Pascal's triangle
        for (int i = 2; i < 11; i++) { // Start from row index 2
            for (int j = 1; j < i; j++) { // Start from column index 1 to avoid edges
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }

        // Step 4: Print Pascal's triangle
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }
    }
}