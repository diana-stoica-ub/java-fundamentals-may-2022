package relationship.inheritance.library.book;

import relationship.inheritance.library.person.Author;

public class ToStayBook extends Book {

    private boolean canBeViewed;

    public ToStayBook(String name, Author author, Genre genre, Integer location, boolean canBeViewed) {
        super(name, author, genre, location);
        this.canBeViewed = canBeViewed;
    }

    public boolean isCanBeViewed() {
        return canBeViewed;
    }

    public void setCanBeViewed(boolean canBeViewed) {
        this.canBeViewed = canBeViewed;
    }
}
