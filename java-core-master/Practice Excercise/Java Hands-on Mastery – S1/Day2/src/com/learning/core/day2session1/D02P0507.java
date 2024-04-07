package com.learning.core.day2session1;

import java.util.ArrayList;
import java.util.List;
 
public class D02P0507 {
 
    public static void main(String[] args) {
        String[] words = {"abc", "xyz", "xyy", "abb"};
        String pattern = "foo";
        List<String> matchedWords = findMatchedWords(words, pattern);
 
        System.out.println("Matched Words: ");
        for (String word : matchedWords) {
            System.out.print(word + " ");
        }
    }
 
    private static List<String> findMatchedWords(String[] words, String pattern) {
        List<String> matchedWords = new ArrayList<>();
        String normalizedPattern = normalizePattern(pattern);
 
        for (String word : words) {
            if (word.length() == pattern.length() && normalizePattern(word).equals(normalizedPattern)) {
                matchedWords.add(word);
            }
        }
 
        return matchedWords;
    }
 
    private static String normalizePattern(String str) {
        StringBuilder builder = new StringBuilder();
        int[] map = new int[256]; 
        int n = str.length();
        int count = 1; 
 
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (map[c] == 0) {
                map[c] = count++;
            }
            builder.append(map[c]);
        }
 
        return builder.toString();
    }
}
