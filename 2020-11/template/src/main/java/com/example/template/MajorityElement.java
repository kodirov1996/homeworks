package com.example.template;

import java.util.HashMap;

public class MajorityElement {
    public int majorityElement(int[] nums) {

        HashMap hashMap = new HashMap();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], count);
            if (hashMap.containsKey(nums[i])) {
           //     hashMap.se
            }
        }
return 0;
    }
}
