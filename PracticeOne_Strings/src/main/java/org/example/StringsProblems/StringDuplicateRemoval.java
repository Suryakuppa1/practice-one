package org.example.StringsProblems;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringDuplicateRemoval {
    public static void main(String[] args) {
        String input = " Have a good good day";
        System.out.println("Before : " + input);
        String result =  duplicateremover(input);
        System.out.println("After : " + result);
    }

    private static String duplicateremover(String input) {
        String[] unique = input.split("\\s+");
        Set<String> words = new LinkedHashSet<>();
        for(String word : unique){
           words.add(word);
        }


        return String.join(" " , words);
    }
}
