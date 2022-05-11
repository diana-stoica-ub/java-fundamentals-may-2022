package relationship.inheritance.library;

import relationship.inheritance.library.book.Genre;
import relationship.inheritance.library.person.Author;

public class Main {

    public static void main(String[] args) {
        System.out.println("Generate books and clients:");
        generateBooks();
        generateClients();
        Library.printBooks();
        Library.printClients();

        System.out.println("Rent books:");
        Library.rentBook("Book4", "CNP1");
        Library.rentBook("Book5", "CNP2");
        Library.printBooks();

        System.out.println("Return books:");
        Library.returnBook("Book4");
        Library.printBooks();

    }

    private static void generateClients() {
        Library.registerClient("Nume", "Prenume", "CNP1");
        Library.registerClient("Nume", "Prenume", "CNP2");
        Library.registerClient("Nume", "Prenume", "CNP3");
    }

    private static void generateBooks() {
        Author author = generateAuthor();

        Library.registerBook("Book1", author, Genre.SF, 1, true);
        Library.registerBook("Book2", author, Genre.STORY, 1, true);
        Library.registerBook("Book3", author, Genre.SF, 1, false);
        Library.registerBook("Book4", author, Genre.SF, 1, false);
        Library.registerBook("Book5", author, Genre.POETRY, 1, false);
    }

    private static Author generateAuthor() {
        Author author = new Author();
        author.setFirstName("Ion");
        author.setLastName("Pop");
        author.setActive(true);

        return author;
    }
}
