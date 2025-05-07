package algorithms;

import java.util.Arrays;

public class recursiveBinarySearch {

    public static int BinarySearch(int[] arr,int s,int e,int key){
        if(s>2){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==key){
            return mid;
        }
        else if(arr[mid]<key){
            return BinarySearch(arr,mid+1,e,key);
        }
        else{
            return BinarySearch(arr,s,mid-1,key);
        }

    }

    public static void main(String[] args) {
        int[] arr = {32, 43, 12, 5, 13};
        Arrays.sort(arr); // must sort the array
        int key = 5;
        int start = 0;
        int end = arr.length-1;
        int index = BinarySearch(arr, start, end, key);
        System.out.println("Key found at index: " + index);
    }
}
