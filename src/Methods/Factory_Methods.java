package Methods;

public class Factory_Methods {
    Car myCar = Car.createCar("Toyota", "Corolla", 2022);
}

class Car {
    private String make;
    private String model;
    private int year;

    private Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public static Car createCar(String make, String model, int year) {
        return new Car(make, model, year);
    }
}

