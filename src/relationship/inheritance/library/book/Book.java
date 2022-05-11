package relationship.inheritance.library.book;

import relationship.inheritance.library.person.Author;

public abstract class Book {

    private String name;
    private Author author;
    private Genre genre;
    private Integer location;

    public Book(String name, Author author, Genre genre, Integer location) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }
}
