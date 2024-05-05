class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) throws InvalidNameException, InvalidAgeException {
        if (name == null || name.length() < 3 || name.length() > 100) {
            throw new InvalidNameException("Invalid name: " + name + ". Name has to be a non-null value whose length is between 3 and 100 characters.");
        }
        if (age < 0 || age > 999) {
            throw new InvalidAgeException("Invalid age: " + age + ". Valid range for age is between 0 and 999.");
        }
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name: " + name + ", age: " + age;
    }
}

public class namevalid {
    public static void main(String[] args) {
        try {
            Student st1 = new Student("Ganga", 25);
            System.out.println("Successfully created st1.\n" + st1);

            // Attempt to create st2
            try {
                Student st2 = new Student("Yamuna", 1003);
                System.out.println("Successfully created st2.\n" + st2);
            } catch (InvalidNameException | InvalidAgeException e) {
                System.out.println("Could not create st2. Error message is: " + e.getMessage());
            }

            // Attempt to create st3
            try {
                Student st3 = new Student("Na", 1004);
                System.out.println("Successfully created st3.\n" + st3);
            } catch (InvalidNameException | InvalidAgeException e) {
                System.out.println("Could not create st3. Error message is: " + e.getMessage());
            }
        } catch (InvalidNameException | InvalidAgeException e) {
            e.printStackTrace();
        }
    }
}

