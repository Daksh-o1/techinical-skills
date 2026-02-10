public class target_sum {
    public static void main(String[] args) {
        int [] arr = {3, -2, 1, 6, 4, 8};
        int k = 10;
        // int sum = 0;
        for(int i = 1; i<arr.length; i++){
            // sum = arr[i-1]+arr[i];
            if(arr[i-1]+arr[i]== k && arr[i-1]!=arr[i]){
                System.out.println(arr[i-1]+" and "+ arr[i]+" is the pairs.");
                break;
            }
        }
    }
}

// wap to sum up upper daigonal element of a matrix
// sum of lower diagonal of a matrix
// wap to find sum of every column of a matrix
// sum of every row of a matrix