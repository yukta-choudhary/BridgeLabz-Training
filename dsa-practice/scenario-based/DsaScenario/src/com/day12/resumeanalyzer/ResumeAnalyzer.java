package com.day12.resumeanalyzer;

import java.io.*;
import java.util.*;
import java.util.regex.*;

// Main logic class
class ResumeAnalyzer {

    // Regex patterns
    static Pattern emailPattern =
            Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.com");

    static Pattern phonePattern =
            Pattern.compile("\\b[6-9][0-9]{9}\\b");

    static Pattern keywordPattern =
            Pattern.compile("\\b(Java|Python|Spring)\\b", Pattern.CASE_INSENSITIVE);

    // Read all resumes from folder
    static Map<String, ResumeData> readResumes(String folderPath) {
        Map<String, ResumeData> resumeMap = new HashMap<>();

        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        for (File file : files) {
            try {
                // Only allow .txt files
                if (!file.getName().endsWith(".txt")) {
                    throw new IOException("Invalid file format");
                }

                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                String email = null;
                String phone = null;
                int keywordCount = 0;

                while ((line = br.readLine()) != null) {

                    // Extract email
                    Matcher emailMatcher = emailPattern.matcher(line);
                    if (emailMatcher.find()) {
                        email = emailMatcher.group();
                    }

                    // Extract phone
                    Matcher phoneMatcher = phonePattern.matcher(line);
                    if (phoneMatcher.find()) {
                        phone = phoneMatcher.group();
                    }

                    // Count keywords
                    Matcher keywordMatcher = keywordPattern.matcher(line);
                    while (keywordMatcher.find()) {
                        keywordCount++;
                    }
                }
                br.close();

                // Store only valid resumes
                if (email != null) {
                    resumeMap.put(email,
                            new ResumeData(email, phone, keywordCount));
                }

            } catch (Exception e) {
                // Skip invalid resumes
                System.out.println("Skipped file: " + file.getName());
            }
        }
        return resumeMap;
    }
}
