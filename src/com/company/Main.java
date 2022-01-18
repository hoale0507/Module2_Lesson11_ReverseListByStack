package com.company;

import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            stack.push(numbers[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = stack.pop();
        }
        System.out.println("Mảng sau khi đảo: " + Arrays.toString(numbers));

        String s1 = "one two three for five";
        String[] s2 = s1.split("\\s");
        Stack <String> stack1 = new Stack <String> ();
        for (int i = 0; i < s2.length; i++) {
            stack1.push(s2[i]);
        }
        for (int i = 0; i < s2.length; i++) {
            s2[i] = stack1.pop();
        }
        String s3 = "";
        for (int i = 0; i < s2.length; i++) {
            s3 += s2[i]+ ", ";
        }

        s1 = s3;
        System.out.println("Chuỗi sau khi đảo: " + s1);
        }
    }
