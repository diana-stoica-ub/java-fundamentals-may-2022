package collection;

import java.util.Objects;

public class EmployeeIdentifier {

    private String code;
    private int id;
    private int series;

    public EmployeeIdentifier(String code, int id, int series) {
        this.code = code;
        this.id = id;
        this.series = series;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeIdentifier that = (EmployeeIdentifier) o;
        return id == that.id && series == that.series && Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, id, series);
    }
}
