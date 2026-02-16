
// sum of frame elements
import java.util.Scanner;

public class sum_of_frame_ele {
    public static void main(String[] args) {
        // int matrix[][] = {
        //         { 1, 2, 3 },
        //         { 4, 5, 6 },
        //         { 7, 8, 9 }
        // };
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
                if(i==0||j==0||i==row-1||j==cols-1){
                    sum += matrix[i][j];
                }
            }
        }

        System.out.println("sum: "+ sum);

        sc.close();
    }
}
