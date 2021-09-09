package com.example.template;

import java.util.Stack;

public class BaseballGame {

    public int calPoints(String[] ops) {

        Stack<String> stringStack = new Stack<>();
        int result = 0;
        for (String op : ops) {

            if (op.equals("D")) {
                stringStack.push(String.valueOf(Integer.valueOf(stringStack.peek()) * 2));
            } else if (!stringStack.empty() && op.equals("+")) {
                int sum = 0;
                sum = Integer.valueOf(stringStack.peek()) + Integer.valueOf(stringStack.get(stringStack.size() - 2));
                stringStack.push(String.valueOf(sum));
            } else if (!stringStack.empty() && op.equals("C")) {
                stringStack.pop();
            } else stringStack.push(op);
        }
        for (int i = 0; i < stringStack.size(); i++) {

            result += Integer.valueOf(stringStack.get(i));
        }
        return result;
    }

}