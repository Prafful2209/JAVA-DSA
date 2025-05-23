public class Solution {
    public static void main(String[] args) {
        int number = 11; // Example input
        System.out.println(hammingWeight(number));
    }

    static int hammingWeight(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
