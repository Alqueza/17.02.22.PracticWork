public class Raven extends Animal implements Flyable{
    public Raven(String name, int age, char gender, double weight) {
        super(name, age, gender, weight);
    }

    public Raven() {
    }

    @Override
    void Eat() {
        System.out.println(name+" ест крошки хлеба");
    }

    @Override
    void sleep() {
        super.sleep();
    }

    @Override
    void morning() {
        super.morning();
    }

    @Override
    public void fly() {
        System.out.println(name+" летает вокруг дерева");
    }

    @Override
    public void fastFly() {
        System.out.println(name+" быстро пролетела над мостом");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
