package generics.generic_class;

public class GenericBox<T> {
    private T content;

    public void add(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public boolean isEmpty() {
        return content == null;
    }
}
