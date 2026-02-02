// given an array of int a find and return the product array of the same size where the ith element of the
// product array will be equal to the product of all elements divided by the ith element of the array.

public class product_of_all_divided_by_i {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int size = arr.length;
        int sum = 0;
        for(int x: arr){
            sum *= x;
        }

        int product[] = new int[size];
        for(int i = 0; i<size; i++){
            product[i] = sum/arr[i];
        }

        for(int ele: product){
            System.out.print(ele+" ");
        }
    }
}
