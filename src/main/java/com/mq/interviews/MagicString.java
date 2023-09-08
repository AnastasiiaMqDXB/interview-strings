package com.mq.interviews;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MagicString {
    private String content;

    public MagicString(String content) {
        this.content = content;
    }

    /**
     * String is considered as Panagram if it contains every letter from English alphabet.
     * Valid Panagram string can contain only english characters, punctuation marks and whitespaces. If it includes
     * anything else, it is not considered as valid Panagram string.
     * Empty string is considered as Panagram.
     */
    public boolean isPanagram() {
        Pattern pattern = Pattern.compile("[a-zA-Z,.;!?\\s]+");
        Matcher matcher = pattern.matcher(this.content);
        if (matcher.matches()) {
            long charactersCount = this.content.replaceAll("[\\s,.;!?]", "")
                    .chars()
                    .distinct()
                    .count();
            return charactersCount > 24;
        } else {
            return false;
        }
    }

    /**
     * String is considered as Palindrome if it is reads the same way backward or forward.
     * Valid Palindrome string can contain only english characters, punctuation marks and whitespaces. If it includes
     * anything else, it is not considered as valid Palindrome string.
     * Empty string is considered as Palindrome.
     */
    public boolean getPalindrome() {
        Pattern pattern = Pattern.compile("[a-zA-Z,.;!?\\s]+");
        Matcher matcher = pattern.matcher(this.content);
        if (!pattern.matcher(this.content).matches()) {
            return false;
        }


        String testString = this.content.replaceAll("[\\s,.;!?]", "");
        StringBuilder builder = new StringBuilder(testString);
        return builder.reverse().toString().equalsIgnoreCase(testString);
    }

    /**
     * Two strings are considered as anagrams, if they contain the same letters but in different order.
     * Valid Anagram strings can contain only english characters, punctuation marks and whitespaces. If they include
     * anything else, they are not considered as valid Anagram string.
     * Empty strings are not considered as Anagrams.
     */
    public boolean anagram(String candidate) {
        Pattern pattern = Pattern.compile("[a-zA-Z,.;!?\\s]+");
        Matcher matcher = pattern.matcher(this.content);
        if (!pattern.matcher(this.content).matches() || !pattern.matcher(candidate).matches()) {
            return false;
        }

        if (candidate.length() != this.content.length()) {
            return false;
        }

        String contentString = this.content.replaceAll("[\\s,.;!?]", "");
        String candidateString = candidate.replaceAll("[\\s,.;!?]", "");
        int[] occurances = new int[28];
        candidateString.toLowerCase().chars().forEach(c -> occurances[c - 97]++);
        contentString.toLowerCase().chars().forEach(c -> occurances[c - 97] = 0);

        return Arrays.stream(occurances).allMatch(i -> i == 0);
    }

    @Override
    public String toString() {
        return this.content;
    }
}
