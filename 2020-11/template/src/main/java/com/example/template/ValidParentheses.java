package com.example.template;

public class ValidParentheses {

    public boolean isValid(String s) {
        boolean bool = false;

        if (s.length() % 2 == 0) {
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) == s.charAt(s.length() - i - 1)) {
                    bool = true;
                }
            }
        }
        return bool;
    }
}



