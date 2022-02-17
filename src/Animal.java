public abstract class Animal {
    protected String name;
    protected int age;
    protected char gender;
    protected double weight;

    public Animal(String name, int age, char gender, Double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }
    public Animal(){

    }

    abstract void Eat();

    void sleep() {
        System.out.println(name+" спит");
    }
    void morning(){
        System.out.println(name+" проснулся");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return
                "\nName: " + name +
                "\nAge: " + age +
                "\nGender: " + gender +
                "\nWeight: " + weight;
    }
}
