package com.logicalques;
// Q2: Count number of words in a sentence
// Input: "Java is very powerful"
// Output: 4

public class CountWords {
    public static void main(String[] args) {
        String sentence = "Java is very powerful";

        long count = java.util.Arrays.stream(sentence.split(" "))
                .count();

        System.out.println(count);
    }
}
