public class Person {
    private int age;

    public Person(int initialAge) {
        if (initialAge < 0) {
            System.out.println("Invalid age. Age set to 0.");
            age = 0;
        } else {
            age = initialAge;
        }
    }

    public void celebrateBirthday() {
        // Private method to update the age
        age++;
        System.out.println("Happy Birthday! Age is now: " + age);
    }

    public void setAge(int newAge) {
        if (newAge < 0) {
            System.out.println("Invalid age. Age remains unchanged.");
        } else {
            age = newAge;
            System.out.println("Age set to: " + age);
        }
    }

    public int getAge() {
        return age; // Public method to get the age
    }

    public static void main(String[] args) {
        Person person = new Person(25);

        System.out.println("Initial age: " + person.getAge());

        person.celebrateBirthday(); // Call a public method to update the age
        System.out.println("Current age: " + person.getAge());

        person.setAge(30); // Call a public method to set the age
        System.out.println("Updated age: " + person.getAge());

        person.setAge(-5); // Attempt to set an invalid age
        System.out.println("Age after invalid update: " + person.getAge());
    }
}
