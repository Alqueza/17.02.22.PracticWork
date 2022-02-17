public abstract class Car {
    public Car(){}

    protected String name;
    protected String model;
    protected String numberOfCar;

    public Car(String name, String model, String numberOfCar) {
        this.name = name;
        this.model = model;
        this.numberOfCar = numberOfCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumberOfCar() {
        return numberOfCar;
    }

    public void setNumberOfCar(String numberOfCar) {
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