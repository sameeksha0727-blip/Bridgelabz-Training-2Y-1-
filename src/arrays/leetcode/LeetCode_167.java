package arrays.leetcode;

import java.util.Scanner;

public class LeetCode_167 {
    public int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == target) {
                return new int[]{start + 1, end + 1};
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return nums;
    }

    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER THE SIZE OF AN ARRAY : ");

            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.print("ENTER THE ARRAY ELEMENTS : ");

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
        }
    }

