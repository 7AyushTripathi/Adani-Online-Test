/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main{

    public static int[][] createRandom2DArray(int numberOfRows, int numberOfColumns) {
        int[][] array = new int[numberOfRows][numberOfColumns];
        Random rand = new Random();
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                array[i][j] = rand.nextInt(101);
            }
        }
        return array;
    }

    public static int[][] sort2DArrayByColumn(int[][] array, int columnIndex) {
        Arrays.sort(array, (a, b) -> a[columnIndex] - b[columnIndex]);
        return array;
    }

    public static void main(String[] args) {
        int numberOfRows = 3;
        int numberOfColumns = 4;
        
        //For user Defined Column and Row size uncomment below code 
        // Scanner sc= new Scanner(System.in);      
        // System.out.println("Enter numberOfRows ");  
        // int numberOfRows= sc.nextInt();  
        // System.out.println("Enter numberOfColumns ");  
        // int numberOfColumns= sc.nextInt(); 
        
         int columnIndex = 2;
        
        
        int[][] array = createRandom2DArray(numberOfRows, numberOfColumns);

        System.out.println("Original array:");
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        array = sort2DArrayByColumn(array, columnIndex);

        System.out.println("Sorted array:");
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}


