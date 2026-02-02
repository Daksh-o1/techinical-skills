public class all_max_ele {
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3};
        int max = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int time = 0;
        for(int i = 0; i<arr.length;i++){
            time += (max - arr[i]);
        }

        System.out.println("Total time taken: "+ time+" seconds.");
    }

}
