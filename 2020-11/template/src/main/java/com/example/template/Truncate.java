package com.example.template;

import java.util.Arrays;

public class Truncate {


    public int peakIndexInMountainArray(int[] arr) {

        int temp;
        int max=Integer.MIN_VALUE;
        if (arr.length > 1) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            for (int i = arr.length-1; i >= 1; i--) {
                if (max<arr[i]-arr[i-1])
                    max=arr[i]-arr[i-1];
            }
            return max;
        }
        else return 0;

    }
}