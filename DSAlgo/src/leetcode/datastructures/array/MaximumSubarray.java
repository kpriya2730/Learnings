package leetcode.datastructures.array;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum
 * and return its sum.
 * A subarray is a contiguous part of an array.
 */
public class MaximumSubarray {
    public static int maxSubArraySum(int[] arr){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int num : arr){
            sum = Math.max(sum+num, num);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public static void main(String[] args){
        int[] arr = new int[]{1,2,-3,1,14};
        int[] arr2 = new int[]{1,2,-3,-8,4};
        int[] arr3 = new int[]{1,-1};
        System.out.println(maxSubArraySum(arr));
        System.out.println(maxSubArraySum(arr2));
        System.out.println(maxSubArraySum(arr3));
    }
}
