package arrays.logical_problems;

import java.util.*;

public class FrequencyOfArray {
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,2,3,3,4,4,4,5,6,6,7,8,8,8,9,9};

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " , ");
        }
        System.out.println();

        for(int i : arr){
            System.out.print(i + " , ");
        }

        System.out.println();

        HashMap<Integer,Integer> map = new HashMap<>();

//        for(int i = 0; i < arr.length; i++){
//            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
//        }
//        System.out.println(map);

        System.out.println();

        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
    }
}
