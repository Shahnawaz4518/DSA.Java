import java.sql.SQLOutput;
import java.util.Scanner;

public class TwoDArrays {
    /*public static void main(String[] args) {
        // Initialize a 3x3 matrix
        int matrix[][] = new int[3][3];
        int n = matrix.length; // Number of rows
        int m = matrix[0].length; // Number of columns
        Scanner sc = new Scanner(System.in);

        // Input: Fill the matrix with user-provided values
        System.out.println("Enter 9 integers to fill the 3x3 matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output: Print the matrix
        System.out.println("The 3x3 matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

       // sc.close(); // Close the scanner


    public static boolean search(int matrix[][],int key) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println("found at cell(" + i + ", "+j+")");
                    return true;
                }
            }
        }
        System.out.println("ket not found");
        return false;
    }
    public static void main(String[] args) {
        // Initialize a 3x3 matrix
        int matrix[][] = new int[3][3];
        int n = matrix.length; // Number of rows
        int m = matrix[0].length; // Number of columns
        Scanner sc = new Scanner(System.in);

        // Input: Fill the matrix with user-provided values
        System.out.println("Enter 9 integers to fill the 3x3 matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output: Print the matrix
        System.out.println("The 3x3 matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix,5);


    }*/

    //SPIRAL MATRIX
    public static void printspiral(int matrix[][]) {
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            //top //for print column
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }//right boundary
            for(int i=startRow;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }//bottom boundary
            for(int j=endCol-1;j>=startCol;j--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }//Left boundary
            for(int i=endRow-1;i>=startRow;i--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;

        }
        System.out.println();

    }

    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
        printspiral(matrix);
    }
}
