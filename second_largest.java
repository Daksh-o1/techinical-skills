import java.util.Scanner;
public class second_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int []arr = new int[size];
        int max = 0;
        int second_largest = 0;
        for(int i = 0; i<size;i++){
            arr[i] = sc.nextInt();
            if(arr[i]>max){
                max = arr[i];
            }
        }

        for(int i =0; i<size;i++){
            if(arr[i]>second_largest && arr[i] != max){
                second_largest = arr[i];
            }
        }
        System.out.println("Second largest: "+ second_largest);
    }   
}
