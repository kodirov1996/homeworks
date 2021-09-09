package com.example.template;

import java.util.Arrays;

public class ReverseString {

    public void reverseString(char[] s) {

        String str="";

        for (int i = s.length-1; i >=0 ; i--) {
           str+=s[i];
        }

        for (int i = 0; i <s.length ; i++) {
            s[i]=str.charAt(i);
        }
        System.out.println();
    }

}