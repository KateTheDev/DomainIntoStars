package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int length = str.length();
        char searchChar = '@';
        boolean isFound = false;
        for (int i = 0; i < length; ++i) {
            if (str.charAt(i) == searchChar) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            char[] emailChars = str.toCharArray();
            for (int i = str.indexOf(searchChar) + 1; i < length; i++) {
                emailChars[i] = '*';
            }
            str = String.valueOf(emailChars);
            System.out.println(str);
        }
    }
}
