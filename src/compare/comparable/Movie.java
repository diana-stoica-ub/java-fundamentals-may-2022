package compare.comparable;

public class Movie implements Comparable<Movie> {
    private String name;
    private int year;
    private double rating;

    public Movie(String name, int year, double rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    //compare by year
    @Override
    public int compareTo(Movie movie) {
        //daca obiectul curent (this) este mai mare decat cel primit ca si parametru (o) -> return numar pozitiv
        //daca obiectul curent (this) este mai mic decat cel primit ca si parametru (o) -> return numar negativ
        //daca sunt egale => 0
        if (this.year > movie.year) {
            return 1;
        } else if (this.year < movie.year) {
            return -1;
        } else {
            return 0;
        }

        //return this.year - o.year;
    }
}
