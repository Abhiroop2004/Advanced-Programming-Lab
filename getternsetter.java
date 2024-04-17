class Person {
    private String name;
    private int age;

    // Getter method for name
    String getName() {
        return name;
    }

    // Setter method for name
    void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    int getAge() {
        return age;
    }

    // Setter method for age
    void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(25);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
