package com.example.template;

public class Search {

    public int searchInsert(int[] nums, int target) {
        int searched=nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i])
            {searched = i;
            break;}
        }
        return searched;
    }

}