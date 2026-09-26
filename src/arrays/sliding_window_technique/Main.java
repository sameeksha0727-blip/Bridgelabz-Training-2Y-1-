package arrays.sliding_window_technique;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
//
//        int sum = 0;
//        int maxSum = 0;
//
//        for(int i = 0; i < k; i++){
//            sum = sum + nums[i];
//        }
//        maxSum = sum;
//
//        for(int i = 1; i <= nums.length-k; i++){
//            sum = sum - nums[i-1] + nums[i+k-1];
//            maxSum = Math.max(sum, maxSum);
//
//            System.out.println(sum);
//        }

  //      Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//
//        int [] nums = new int[n];
//
//        for(int i=0; i<n;i++){
//            nums[i] = sc.nextInt();
//        }


             HashMap<Integer,Integer> map = new HashMap<>();
//            for(int i=0; i<k; i++)
//                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//
//            System.out.print(map.size() + " ");
//
//            for(int i=k; i<n; i++){
//                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//
//                map.put(nums[i-k],map.get(nums[i-k])-1);
//
//                if(map.get(nums[i-k]) == 0)
//                    map.remove(nums[i-k]);
//
//                System.out.print(map.size() + " ");
       // }

//        int sum=0,max=0;
//        for(int i=0; i<k; i++){
//            sum+= nums[i];
//        }
//        max=sum;
//
//        for(int i=1; i<=n-k; i++){
//            sum = sum - nums[i-1] + nums[i+k-1];
//            max = Math.max(sum,max);
//
//            System.out.println((double)max/k);
//
//        }

//         String s = sc.nextLine();
//         int count = 0;
//
//         for(int i = 0; i < s.length()-3; i++){
//             char a = s.charAt(i);
//             char b = s.charAt(i+1);
//             char c = s.charAt(i+2);
//             if(a != b && b != c && a != c){
//                 count++;
//             }
//         }
//        System.out.println(count);
         int sum = 0, count = 0;
          map.put(0,1);

          for(int x : nums){
              sum += x;
              if(map.containsKey(sum-k))
                  count+= map.get(sum-k);

              map.put(sum,map.getOrDefault(sum,0)+1);
          }
        System.out.println(count);
    }
}
