// 26. Remove Duplicates from Sorted Array

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int removeDuplicates(int[] nums) {

        int i = 0;

        for (int j = i + 1; j < nums.length; j++) {

            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}

public class l2 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            
            int[] nums = new int[n];
            
            System.out.print("Enter array elements: ");
            
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            
            Arrays.sort(nums);
            
            Solution s1 = new Solution();
            
            int k = s1.removeDuplicates(nums);
            
            System.out.println("\nSorted array after removing duplicates:");
            
            for (int i = 0; i < k; i++) {
                System.out.print(nums[i] + " ");
            }
            
            System.out.println("\nNumber of unique elements: " + k);
        }
    }
}