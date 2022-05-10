package introduction.classes;

public enum ContractType {
    PART_TIME(4, "I work part time"),
    FULL_TIME(8, "I work full time"),
    PROJECT_BASED(2, "I work project based");

    final private int numberOfHoursWorked;
    final private String message;

    ContractType(int numberOfHoursWorked, String message) {
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.message = message;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public String getMessage() {
        return message;
    }
}
