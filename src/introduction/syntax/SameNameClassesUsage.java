package introduction.syntax;

import relationship.inheritance.library.book.Book;
import relationship.inheritance.library.book.Genre;
import relationship.inheritance.library.book.ToStayBook;

public class SameNameClassesUsage {

    public static void main(String[] args) {
        Book bookFromInheritance = new ToStayBook("name", null, Genre.SF, 11, true);

        relationship.composition.Book bookFromComposition = new relationship.composition.Book();
    }
}
