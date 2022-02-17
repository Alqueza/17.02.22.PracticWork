public class Shark extends Animal implements Swimable{
    public Shark(String name, int age, char gender, Double weight) {
        super(name, age, gender, weight);
    }

    public Shark() {

    }

    @Override
    void Eat() {
        System.out.println(name+" охотится за малюском!");
    }

    @Override
    void sleep() {
        super.sleep();
    }

    @Override
    void morning() {
        System.out.println(name+" morning");
    }

    @Override
    public void swim() {
        System.out.println(name+" плавает за стаей рыб");
    }

    @Override
    public void fastSwim() {
        System.out.println(name+" быстро плавает вокруг корабля");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
