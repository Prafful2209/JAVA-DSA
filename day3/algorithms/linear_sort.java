package algorithms;

public class linear_sort {
    public static int search(int [] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={14,3,6,64,4,11};
        System.out.println(search(arr,11));
    }
}
