public class pivot {
    public static void main(String[] args) {
        int arr[] = {-7, 1, 5, 2, -4, 3, 0};
        int total = 0;
        for(int x: arr) total+=x;
        int leftSum =0;
        int count = 0;
        for(int i = 0; i<arr.length;i++){
            int rightSum = total - leftSum - arr[i];
            if(leftSum == rightSum){
                count++;
                System.out.println("Pivot index: "+ i);
            }
            leftSum += arr[i];
        }
        if(count == 0){
            System.out.println("No pivot index found.");
        }else{
            System.out.println("Pivot index count: "+ count);
        }
    }
}

// -7, 1, 5, 2, -4, 3, 0