
// sum of frame elements
import java.util.Scanner;

public class sum_of_frame_ele {
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int row = matrix.length;
        int cols = matrix[0].length;

        int sum = 0;
        for (int i = 0; i < row; i++) {
            for(int j = 0;j<cols;j++){
                if(i==0||j==0||i==row-1||j==cols-1){
                    sum += matrix[i][j];
                }
            }
        }

        System.out.println("sum: "+ sum);
    }
}
