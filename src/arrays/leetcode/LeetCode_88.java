package arrays.leetcode;

import java.util.Arrays;

import java.util.Scanner;

public class LeetCode_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        for(int i = 0; i < m; i++){
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
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


