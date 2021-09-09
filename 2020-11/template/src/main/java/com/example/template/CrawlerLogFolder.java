package com.example.template;

import java.util.Stack;

public class CrawlerLogFolder {

    public int minOperations(String[] logs) {

        Stack<String> stringStack = new Stack<>();

        for (String s : logs) {

            if (!stringStack.empty() && s.equals("./"))
                continue;
            else if (!stringStack.empty() && s.equals("../"))
                stringStack.pop();
            else if (!s.equals("./")&&!s.equals("../"))stringStack.push(s);
        }
        return stringStack.size();
    }
}