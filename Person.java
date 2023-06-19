// Класс Person
class Person {
    private String fullName;
    private int age;

    // Конструктор без параметров
    public Person() {
        this.fullName = "someone";
    }

    // Конструктор с параметрами
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // Метод move()
    public void move() {
        System.out.println(fullName + " is walking.");
    }

    // Метод talk()
    public void talk() {
        System.out.println(fullName + " is speaking.");
    }
};