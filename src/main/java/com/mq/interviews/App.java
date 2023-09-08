package com.mq.interviews;

import java.util.Scanner;

/**
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Try entering:");
        System.out.println("The quick brown fox jumps over the lazy dog!");
        System.out.println("!god yzal eht revo spmuj xof nworb kciuq ehT");
        while(true){
            System.out.println("Enter first line of text or /exit for exiting program:");
            String userInput0 = scanner.nextLine().trim();
            if(userInput0.equalsIgnoreCase("/exit")){
                System.out.println("Exiting...");
                break;
            }
            System.out.println("Enter second line of text:");
            String userInput1 = scanner.nextLine().trim();

            MagicString magicString0 = new MagicString(userInput0);
            MagicString magicString1 = new MagicString(userInput1);
            System.out.println("Does \"" + magicString0 + "\": PANAGRAM: " + magicString0.isPanagram() + ", PALINDROME: " + magicString0.getPalindrome());
            System.out.println("Does \"" + magicString1 + "\": PANAGRAM: " + magicString1.isPanagram() + ", PALINDROME: " + magicString0.getPalindrome());
            System.out.println("Are they anagrams? " + magicString0.anagram(userInput1));
        }

    }
}
