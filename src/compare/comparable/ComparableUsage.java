package compare.comparable;

import java.util.Arrays;

public class ComparableUsage {

    public static void main(String[] args) {
        Movie titanic = new Movie("Titanic", 1991, 10);
        Movie starWars = new Movie("StarWars", 2000, 9.9);
        Movie starWars2 = new Movie("StarWars2", 2002, 8);
        Movie oldMovie = new Movie("OldMovie", 1920, 7);

        if (oldMovie.compareTo(titanic) > 0) {
            System.out.println("OldMovie is greater than Titanic");
        } else if (oldMovie.compareTo(titanic) < 0) {
            System.out.println("Titanic is greater than OldMovie");
        } else {
            System.out.println("Titanic and OldMovie are equal");
        }

        Movie[] movies = {titanic, starWars, starWars2, oldMovie};
        Arrays.sort(movies);
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " : " + movie.getYear());
        }

        Actor actor1 = new Actor("John", "Doe");
        Actor actor2 = new Actor("Ana", "Doe");
        Actor actor3 = new Actor("Ana" , "David");

        Actor[] actors = {actor1, actor2, actor3};
        Arrays.sort(actors);        //daca clasa Actor nu este comparabila => exceptie ClassCastException
        for (Actor actor : actors) {
            System.out.println(actor.getFirstName() + " " + actor.getLastName());
        }

    }
}
