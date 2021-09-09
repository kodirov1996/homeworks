package com.example.template;

public class MissingNumber {

    public int missingNumber(int[] nums) {

        int[] numsArray = new int[nums.length + 1];
        boolean bool = false;
        int result = 0;

        for (int i = 0; i < numsArray.length; i++) {
            numsArray[i] = i;

            for (int j = 0; j < nums.length; j++) {
                if (numsArray[i] == nums[j]) {
                    bool = true;
                }
                if (j == nums.length - 1 && !bool) {
                    result = numsArray[i];
                    break;
                } else if (j == nums.length - 1 && bool) {bool = false;}

            }
        }
        return result;

    }

}
