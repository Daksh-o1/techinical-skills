import java.util.Scanner;
public class read_and_print_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        //Declaring matrix:-
        int [][] matrix = new int [rows][cols];

        // taking matrix user input:-
        for(int i =0; i<rows;i++){
            for(int j = 0; j<cols; j++){
                System.out.print("Enter element: ");
                matrix[i][j] = sc.nextInt(); 
            }
        }

        // printing the matrix:-
        for(int i = 0; i<rows;i++){
            for(int j = 0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }    
}
