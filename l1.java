// 11. Container With Most Water
import java.util.Scanner;
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxwater = 0;

        while (left < right) {
            int leftheight = height[left];
            int rightheight = height[right];

            int water = (right - left ) * Math.min(leftheight,rightheight);

            if(maxwater<water) maxwater = water;

            if(leftheight<rightheight){
                do{
                    left++;
                }
                while(left < right && height[left] <= leftheight);
            }else {

                do {
                    right--;
                } while (left < right && height[right] <= rightheight);
            }

        
        }
        return maxwater;
    }
}
public class l1{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of Array : ");
            int n = sc.nextInt();
            
            int[] arr = new int[n];
            
            System.out.print("Enter elements of Array : ");
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            
            Solution s1 = new Solution();
            int result = s1.maxArea(arr);
            System.out.println(result);
        }

    }
}