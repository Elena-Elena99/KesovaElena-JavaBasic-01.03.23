package MyProject;

import java.util.Scanner;

public class MatrixTransposition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number of lines: ");
        int line = in.nextInt();
        System.out.print("Input number of columns: ");
        int column = in.nextInt();
        int[][] array1 = new int[line][column];
        int[][] array2 = new int[column][line];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                array1[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < line; j++) {
                array2[i][j] = array1[j][i];
            }
        }
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(" " + array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < line; j++) {

                System.out.print(" " + array2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
