import java.util.Scanner;
public class upper_diagonal_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();
        int sum =0;

        int [][] matrix = new int[rows][cols];
        for(int i =0; i<rows; i++){
            for(int j =0; j<cols;j++){
                System.out.print("Enter element: ");
                matrix[i][j] = sc.nextInt();
                if(j>i){
                    sum+=matrix[i][j];
                }
            }
        }

        System.out.println("Sum of upper diagonls: "+ sum);
    }
}
