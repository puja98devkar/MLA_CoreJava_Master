package com.learning.core.day4session1;

import java.util.Stack;

public class D04P0903 {
    
    public static int evaluate(String expression) {
        // Stack for numbers: 'values'
        Stack<Integer> values = new Stack<Integer>();
 
        // Stack for Operators: 'ops'
        Stack<Character> ops = new Stack<Character>();
 
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
 
            // Current token is a whitespace, skip it
            if (c == ' ')
                continue;
 
            // Current token is a number, push it to stack for numbers
            if (c >= '0' && c <= '9') {
                StringBuilder sb = new StringBuilder();
                // There may be more than one digits in number
                while (i < expression.length() && expression.charAt(i) >= '0' && expression.charAt(i) <= '9')
                    sb.append(expression.charAt(i++));
                values.push(Integer.parseInt(sb.toString()));
                i--; // since the for loop also increases i
            }
 
            // Current token is an opening brace, push it to 'ops'
            else if (c == '(')
                ops.push(c);
 
            // Closing brace encountered, solve entire brace
            else if (c == ')') {
                while (ops.peek() != '(')
                  values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                ops.pop();
            }
 
            // Current token is an operator
            else if (c == '+' || c == '*') {
                // While top of 'ops' has same or greater precedence to current
                // token, which is an operator. Apply operator on top of 'ops'
                // to top two elements in values stack
                while (!ops.empty() && hasPrecedence(c, ops.peek()))
                  values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                // Push current token to 'ops'.
                ops.push(c);
            }
        }
 
        // Entire expression has been parsed at this point, apply remaining ops to remaining values
        while (!ops.empty())
            values.push(applyOp(ops.pop(), values.pop(), values.pop()));
 
        // Top of 'values' contains result, return it
        return values.pop();
    }
 
    // Returns true if 'op2' has higher or same precedence as 'op1',
    // otherwise returns false.
    public static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' && op2 == '+'))
            return false;
        else
            return true;
    }
 
    // A utility method to apply an operator 'op' on operands 'a'
    // and 'b'. Return the result.
    public static int applyOp(char op, int b, int a) {
        switch (op) {
            case '+':
                return a + b;
            case '*':
                return a * b;
        }
        return 0;
    }
 
    // Driver method to test above methods
    public static void main(String[] args) {
        String expression = "10+2*6";
        System.out.println(evaluate(expression));
    }
}