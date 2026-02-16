//wap to find sum of core elements of a matrix

import java.util.Scanner;

public class sum_of_cores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size: ");
        int row = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[row][cols];
        for(int i =0;i<row;i++){
            for(int j =0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for(int j = 0;j<cols;j++){
                if(i!=0 && j!=0 && i!=row-1 && j!=cols-1){
                    sum += matrix[i][j];
                    // System.out.println("Core elements: ");
                    System.out.print(matrix[i][j]+" ");
                }
            }
            System.out.println();
        
        }

        System.out.println("sum: "+ sum);

        sc.close();
    }
}
