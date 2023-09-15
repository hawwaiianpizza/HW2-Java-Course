//immutable class
public final class Employee {
    private final String fullName;
    private final String position;
    private final String email;
    private final int age;

    public Employee(String fullName, String position, String email, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.age = age;
    }

    public static void ageCompare(int age1, int age2) {
        if (age1 > age2) {
            System.out.println("age1 > age2");
        } else if (age1 < age2) {
            System.out.println("age1 < age2");
        } else {
            System.out.println("age1 = age2");
        }
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
}
