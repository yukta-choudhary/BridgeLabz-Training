package com.streamapi.trendingmovies;

import java.util.*;
import java.util.stream.Collectors;

public class TrendingMain {

    public static void main(String[] args) {

        List<Movie> movies = List.of(
            new Movie("Inception", 8.8, 2010),
            new Movie("Interstellar", 8.6, 2014),
            new Movie("Avatar", 7.9, 2009),
            new Movie("Avengers: Endgame", 8.4, 2019),
            new Movie("Joker", 8.5, 2019),
            new Movie("The Batman", 7.8, 2022),
            new Movie("Oppenheimer", 8.9, 2023),
            new Movie("Dune", 8.1, 2021)
        );

        List<Movie> topTrending = movies.stream()
                .filter(m -> m.getReleaseYear() >= 2010)
                .sorted(Comparator
                        .comparing(Movie::getRating).reversed()
                        .thenComparing(Movie::getReleaseYear).reversed())
                .limit(5)
                .collect(Collectors.toList());

        topTrending.forEach(System.out::println);
    }
}
