package com.mq.interviews;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicStringTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testIsPanagram0() {
        MagicString magicString = new MagicString("The quick brown fox jumps over the lazy dog!");
        boolean panagram = magicString.isPanagram();
        assertTrue(panagram);
    }
    @Test
    public void testIsPanagram1() {
        MagicString magicString = new MagicString("!god yzal eht revo spmuj xof nworb kciuq ehT");
        boolean panagram = magicString.isPanagram();
        assertTrue(panagram);
    }

    @Test
    public void testgetPalindrome() {
        MagicString magicString = new MagicString("A man, a plan, a canal, Panama!");
        boolean palindrome = magicString.getPalindrome();
        assertTrue(palindrome);
    }

    @Test
    public void testAnagram() {
        MagicString magicString = new MagicString("The quick brown fox jumps over the lazy dog!");
        boolean anagram = magicString.anagram("The quick brown fox over jumps the lazy dog!");
        assertTrue(anagram);
    }

}