public abstract class Car {
    protected String name;
    protected String model;
    protected String numberOfCar;

    public Car(String name, String model, String numberOfCar) {
        this.name = name;
        this.model = model;
        this.numberOfCar = numberOfCar;
    }

    @Override
    public String toString() {
        return
                "\nНазвание: " + name +
                "\nМодель: " + model +
                "\nНомер машины: " + numberOfCar;
    }
}