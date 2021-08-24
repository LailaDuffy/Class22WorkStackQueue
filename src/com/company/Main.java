package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a word/sentence: ");
        String inputPalindrome = scanner.nextLine();

        String inputPalindromeLowerCase = inputPalindrome.toLowerCase();
        String inputPalindromeNoSpaces = inputPalindromeLowerCase.replaceAll("\\W", "");


        Queue<Character> myQueue = new LinkedList<Character>();
        Stack<Character> myStack = new Stack<>();
        for (int i = 0; i < inputPalindromeNoSpaces.length(); i++) {
            myStack.push(inputPalindromeNoSpaces.charAt(i));
            myQueue.add(inputPalindromeNoSpaces.charAt(i));
        }

        for (int i = 0; i < inputPalindromeNoSpaces.length(); i++) {
            if (myStack.lastElement().equals(myQueue.peek())) {
                myStack.pop();
                myQueue.remove(inputPalindromeNoSpaces.charAt(i));
            }
        }

        if (myStack.isEmpty() && myQueue.isEmpty()) {
            System.out.println(String.format("The word or sentence %s IS a palindrome.", inputPalindrome));

        } else {
            System.out.println(inputPalindrome + " IS NOT a palindrome");
        }
    }
}
