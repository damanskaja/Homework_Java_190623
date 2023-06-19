// Главный класс
public class Main {
    public static void main(String[] args) {
        // Создание объекта Person с помощью конструктора без параметров
        Person person1 = new Person();

        // Создание объекта Person с помощью конструктора с параметрами
        Person person2 = new Person("John Smith", 25);

        // Вызов методов move() и talk() для каждого объекта
        person1.move();
        person1.talk();

        person2.move();
        person2.talk();

        // Создание трех экземпляров Phone
        Phone phone1 = new Phone("+123456789", "Google", 0.2);
        Phone phone2 = new Phone("+987654321", "Samsung", 0.3);
        Phone phone3 = new Phone("+999999999", "iPhone", 0.4);

        // Вывод значений переменных объектов Phone
        System.out.println("Phone 1: Number - " + phone1.getNumber() + ", Model - " + phone1.getModel() + ", Weight - " + phone1.getWeight());
        System.out.println("Phone 2: Number - " + phone2.getNumber() + ", Model - " + phone2.getModel() + ", Weight - " + phone2.getWeight());
        System.out.println("Phone 3: Number - " + phone3.getNumber() + ", Model - " + phone3.getModel() + ", Weight - " + phone3.getWeight());

        // Вызов метода receiveCall() для каждого объекта Phone
        phone1.receiveCall("Ben");
        phone2.receiveCall("Alice");
        phone3.receiveCall("John");
    }
};