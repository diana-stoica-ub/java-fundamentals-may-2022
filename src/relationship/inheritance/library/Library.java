package relationship.inheritance.library;

import relationship.inheritance.library.book.Book;
import relationship.inheritance.library.book.Genre;
import relationship.inheritance.library.book.ToGoBook;
import relationship.inheritance.library.book.ToStayBook;
import relationship.inheritance.library.person.Author;
import relationship.inheritance.library.person.Client;

public class Library {

    private static Book[] books = new Book[100];
    private static Client[] clients = new Client[100];

    private static int noOfBooks = 0;
    private static int noOfClients = 0;

    public static void printBooks() {
        for (int i = 0 ; i< noOfBooks; i++) {
            System.out.println(books[i]);
        }
    }

    public static void printClients() {
        for (int i = 0; i < noOfClients; i++) {
            System.out.println(clients[i]);
        }
    }

    public static void returnBook(String name) {
        ToGoBook book = findBookInDatabase(name);
        if (book == null) {
            //System.out.println("Book not found");
            throw new RuntimeException("Book not found");
        } else {
            book.returnBook();
        }
    }

    public static void rentBook(String name, String cnp) {
        ToGoBook book = findBookInDatabase(name);
        if (book == null) {
            System.out.println("Book not found");
            return;
        }
        Client client = findClientInDatabase(cnp);
        if (client == null) {
            System.out.println("Client not found");
            return;
        }
        book.setClient(client);
    }

    public static void registerClient(String firstName, String lastName, String cnp) {
        Client client = createClient(firstName, lastName, cnp);
        addClientToDatabalse(client);
    }

    public static void registerBook(String name, Author author, Genre genre, Integer location, boolean isToStayBook) {
        Book book;
        if (isToStayBook) {
            book = createToStayBook(name, author, genre, location);
        } else {
            book = createToGoBook(name, author, genre, location);
        }
        addBookToDatabase(book);
    }

    private static Book createToStayBook(String name, Author author, Genre genre, Integer location) {
        Book book = new ToStayBook(name, author, genre, location, true);
        return book;
    }

    private static Book createToGoBook(String name, Author author, Genre genre, Integer location) {
        Book book = new ToGoBook(name, author, genre, location);
        return book;
    }

    private static void addBookToDatabase(Book book) {
        books[noOfBooks] = book;
        noOfBooks++;
    }

    private static Client createClient(String firstName, String lastName, String cnp) {
        Client client = new Client(firstName, lastName, cnp);
        return client;
    }
    private static void addClientToDatabalse(Client client) {
        clients[noOfClients] = client;
        noOfClients++;
    }

    private static ToGoBook findBookInDatabase(String name) {
        for (Book book : books) {
            if (book.getName().equals(name)) {
                ToGoBook toGoBook = (ToGoBook) book;        //cast
                return toGoBook;
            }
        }
        return null;
    }

    private static Client findClientInDatabase(String cnp) {
        for (Client client : clients) {
            if (client.getCnp().equals(cnp)) {
                return client;
            }
        }
        return null;
    }

}
