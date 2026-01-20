// Q. Given an array count num of ele having atleast one element greater itself.

// OBSERVATION:- Question asking for the counts of elements which have another element greater than that element
//              there will be one element in the array which is the largest. finding it and comapring with others
//              can get the count of those array.

// sudo code:-1>. iterate to get the maximum element
//            2>. iterate and compare other elements to the maximun and increasing the counter.

public class arr{
    public static void main(String[] args) {
        int arr[] = {-1, 2, 0, 3, -2, 4}; // declaring/initializing an array
        int count =0;// declaring count variable
        int ele = arr[0];
        // looping to get the max element from the array
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>ele){
                ele = arr[i];
            }
        }

        // looping to find the numbers other than max
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=ele && arr[i]<ele){
                count++; // counting number of elements 
            }
        }
        System.out.println(count);
    }
}


