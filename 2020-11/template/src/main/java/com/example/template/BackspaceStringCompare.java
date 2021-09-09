package com.example.template;

import java.util.Stack;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    public String build(String s) {
        Stack<Character> characters = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c != '#')
                characters.push(c);
            else if(!characters.empty())
                characters.pop();
        }
        return characters.toString();

    }


}
