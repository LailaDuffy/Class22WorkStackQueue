package com.company;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a word/sentence: ");
        String inputPalindrome = scanner.next();

        String inputPalindromeLowerCase = inputPalindrome.toLowerCase();
        String inputPalindromeNoSpaces = inputPalindromeLowerCase.replaceAll("\\W", "");

        System.out.println(inputPalindromeNoSpaces);

        PriorityQueue<Character> myQueue = new PriorityQueue<>();
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < inputPalindromeNoSpaces.length(); i++) {
            myStack.push(inputPalindromeNoSpaces.charAt(i));
            myQueue.add(inputPalindromeNoSpaces.charAt(i));
        }
        System.out.println(myQueue);
        System.out.println(myStack);

        for (int i = 0; i < myStack.size(); i++) {
            if (myStack.lastElement().equals(myQueue.peek())) {
                myStack.pop();
                myQueue.remove();
                System.out.println(myStack.lastElement() + " equals " + myQueue.peek());
            } else {
                System.out.println(inputPalindrome + " not a palindrome");
            }

        }


    }
}
