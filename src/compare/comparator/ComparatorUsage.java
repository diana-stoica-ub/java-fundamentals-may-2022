package compare.comparator;

import compare.comparable.Movie;

import java.util.Arrays;

public class ComparatorUsage {

    public static void main(String[] args) {
        Movie titanic = new Movie("Titanic", 1991, 10);
        Movie starWars = new Movie("StarWars", 2000, 9.9);
        Movie starWars2 = new Movie("StarWars2", 2002, 8);
        Movie oldMovie = new Movie("OldMovie", 1920, 7);

        Movie[] movies = {titanic, starWars, starWars2, oldMovie};
        NameComparator nameComparator = new NameComparator();
        System.out.println("Sorted by name:");
        Arrays.sort(movies, nameComparator);

        for (Movie movie : movies) {
            System.out.println(movie.getName() + " " + movie.getYear());
        }

        System.out.println("Sort by rating");
        Arrays.sort(movies, new RatingComparator());
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " " + movie.getYear() + " " + movie.getRating());
        }

    }
}
