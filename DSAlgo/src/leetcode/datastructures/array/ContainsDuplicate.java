package leetcode.datastructures.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every
 * element is distinct.
 */
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] arr){
        Set<Integer> seenNums = new HashSet<>();
        for(int num : arr){
            if(seenNums.contains(num)){
                return true;
            }
            seenNums.add(num);
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,1,4};
        int[] arr2 = new int[]{1,2,3,8,4};
        int[] arr3 = new int[]{1,1};
        System.out.println(containsDuplicate(arr));
        System.out.println(containsDuplicate(arr2));
        System.out.println(containsDuplicate(arr3));
    }
}
