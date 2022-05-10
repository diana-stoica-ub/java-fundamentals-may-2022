package introduction.static_members;

public class StaticMembersUsage {

    public static void main(String[] args) {
        System.out.println(BMW.noOfWheels);
        System.out.println(BMW.maxSpeed);
        System.out.println(BMW.convertFromKmPerHourToMilesPerHour(150L));
    }
}
