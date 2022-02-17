public class Fox extends Animal implements Runable{
    public Fox(String name, int age, char gender, Double weight) {
        super(name, age, gender, weight);
    }

    public Fox() {
    }

    @Override
    void Eat() {
        System.out.println(name+" охотится за кроликом");
    }

    @Override
    void sleep() {
        System.out.println(name+" сладко спит в норе");
    }

    @Override
    void morning() {
        super.morning();
    }

    @Override
    public void run() {
        System.out.println(name+" бегает по полю");
    }

    @Override
    public void fastRun() {
        System.out.println(name+" быстро бегает в гуще леса");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
