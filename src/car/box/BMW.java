package car.box;

public class BMW extends Car implements OperateCar {
    public BMW(String name, String model, String numberOfCar) {
        super(name, model, numberOfCar);
    }

    public BMW() {
    }

    @Override
    public void turnOn() {
        System.out.println(name + " завелась");
    }
    @Override
    public void turnLeft() {
        System.out.println(name+" повернул(а) на лево");
    }

    @Override
    public void turnRight() {
        System.out.println(name+" повернул(а) на право");
    }

    @Override
    public void go() {
        System.out.println(name + " поехала");
    }

    @Override
    public void stop() {
        System.out.println(name + " остановилась");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
