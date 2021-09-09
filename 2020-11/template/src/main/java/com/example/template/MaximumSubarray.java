package com.example.template;

public class MaximumSubarray {

    public int maxSubArray(int[] nums) {

        int maxValue = Integer.MIN_VALUE;

        int sum=0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i; j <nums.length ; j++) {
                sum=sum+nums[j];
                if (sum>maxValue)
                    maxValue=sum;
            }
            sum=0;
        }
        return maxValue;
    }
}