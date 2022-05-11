package relationship.inheritance.library.book;

import relationship.inheritance.library.person.Author;
import relationship.inheritance.library.person.Client;

public class ToGoBook extends Book {

    private Client client;

    public ToGoBook(String name, Author author, Genre genre, Integer location) {
        super(name, author, genre, location);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public boolean isBookAvailable() {
        if (client == null && isBookInLibrary() && isBookLaunched()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isBookInLibrary() {
        return true;
    }

    private boolean isBookLaunched() {
        return true;
    }

    public void returnBook() {
        client = null;
    }

    @Override
    public String toString() {
        return "ToGoBook{" +
                "client=" + client +
                "} " + super.toString();
    }
}
