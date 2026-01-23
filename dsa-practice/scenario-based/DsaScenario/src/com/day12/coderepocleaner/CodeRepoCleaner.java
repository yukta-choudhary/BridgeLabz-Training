package com.day12.coderepocleaner;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class CodeRepoCleaner {

    public static void main(String[] args) throws Exception {

        List<Path> javaFiles = new ArrayList<>();
        Files.walk(Paths.get("src"))
                .filter(p -> p.toString().endsWith(".java"))
                .forEach(javaFiles::add);

        Pattern badMethod = Pattern.compile("void [A-Z].*");
        Set<String> unusedImports = new HashSet<>();

        for (Path p : javaFiles) {
            List<String> lines = Files.readAllLines(p);
            for (String line : lines) {
                if (badMethod.matcher(line).find())
                    System.out.println("Bad Method: " + p);
                if (line.startsWith("import"))
                    unusedImports.add(line);
            }
        }
    }
}
