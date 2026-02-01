package com.collectors.librarybook;

import java.util.*;
import java.util.stream.Collectors;
import java.util.IntSummaryStatistics;

public class LibraryMain {

    public static void main(String[] args) {

        List<Book> books = List.of(
                new Book("One of us is lying", "Fiction", 300),
                new Book("Wise and Otherwise", "Fiction", 299),
                new Book("Grandma's Bag of Stories", "Fiction", 249),
                new Book("Diary of a Wimpy Kid: The Long Haul", "Children", 399),
                new Book("Diary of a Wimpy Kid: Rodrick Rules", "Children", 349)

        );

        Map<String, IntSummaryStatistics> statsByGenre = books.stream()
                .collect(Collectors.groupingBy(
                        Book::getGenre,
                        Collectors.summarizingInt(Book::getPages)
                ));

        statsByGenre.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println("Total Pages: " + stats.getSum());
            System.out.println("Average Pages: " + stats.getAverage());
            System.out.println("Max Pages: " + stats.getMax());
            System.out.println("----------------------");
        });
    }
}
