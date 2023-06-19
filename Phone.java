// Класс Phone
class Phone {
    private String number;
    private String model;
    private double weight;

    // Конструктор с параметрами
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Метод receiveCall()
    public void receiveCall(String callerName) {
        System.out.println(callerName + " is calling");
    }

    // Геттер getNumber()
    public String getNumber() {
        return this.number;
    }

    public String getModel() {
        return this.model;
    }

    public double getWeight() {
        return this.weight;
    }
};