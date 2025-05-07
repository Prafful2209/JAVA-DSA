package algorithms;

public class binary_sort {
    public static int binarySearch(int[] arr,int key){
        int s=0;
        int e= arr.length-1;
        while (s<=e) {
            int mid = (s + e) / 2;
            if(arr[mid]==key){
                return mid;

            }
            else if(arr[mid]<key){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,34,64,13,6,86};
        System.out.println(binarySearch(arr,1));
    }
}
