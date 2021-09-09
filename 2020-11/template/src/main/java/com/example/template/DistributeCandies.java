package com.example.template;

public class DistributeCandies {

    public int distributeCandies(int[] candyType) {
        int count = 0;
        boolean bool = false;

        for (int i = 0, j = 0; i < candyType.length - 1; i++) {
            if (candyType[j] == candyType[i]) {
                bool = true;
            } else if (bool = true && candyType[j] != candyType[i]) {
                count++;
                bool = false;
            } else {
                j = i;

            }
        }
        return count;

    }

}
