package com.day12.examscanner;
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamScanner {

    public static void main(String[] args) throws Exception {

        String[] answerKey = {"A","B","C","D","A","B","C"};
        Map<String, Integer> scores = new HashMap<>();

        Pattern validOption = Pattern.compile("[A-D]");

        BufferedReader br =
                new BufferedReader(new FileReader("answers.csv"));

        String line;
        while ((line = br.readLine()) != null) {
            try {
                String[] data = line.split(",");
                int score = 0;

                for (int i = 1; i < data.length; i++) {
                    if (!validOption.matcher(data[i]).matches())
                        throw new Exception();

                    if (data[i].equals(answerKey[i-1]))
                        score++;
                }
                scores.put(data[0], score);

            } catch (Exception e) {
                System.out.println("Invalid row skipped");
            }
        }
        br.close();

        // Sort using PriorityQueue
        PriorityQueue<Map.Entry<String,Integer>> pq =
                new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());

        pq.addAll(scores.entrySet());

        while (!pq.isEmpty())
            System.out.println(pq.poll());
    }
}
