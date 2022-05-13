package immutable;

public class Street {

    final private String name;
    final private Integer number;

    public Street(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public Integer getNumber() {
        return number;
    }
}
