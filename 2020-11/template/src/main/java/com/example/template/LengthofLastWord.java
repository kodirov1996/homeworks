package com.example.template;

public class LengthofLastWord {

    public int lengthOfLast(String s) {
        int count=0;
        s=s.trim();
        System.out.println(s);
        for (int i = s.length()-1; i >=0 ; i--) {
            if (s.charAt(i)!=' ')count++;
            else return count;
        }
        return count;

    }

}