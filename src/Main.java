public class Main {
    public static void main(String[] args) {
        Raven raven = new Raven("Raven",3,'F',3.0);
        System.out.println(raven);
        raven.morning();
        raven.Eat();
        raven.fly();
        raven.fastFly();
        raven.sleep();
        System.out.println();

        Fox fox = new Fox("Fox",6,'M',13.5);
        System.out.println(fox);
        fox.morning();
        fox.Eat();
        fox.run();
        fox.fastRun();
        fox.sleep();
        System.out.println();

        Shark shark = new Shark("Shark",10,'F',30.3);
        System.out.println(shark);
        shark.morning();
        shark.Eat();
        shark.swim();
        shark.fastSwim();
        shark.sleep();
        System.out.println();
//        Tesla tesla = new Tesla("Tesla","Tesla Model X","3215");
//        System.out.println(tesla);
//        tesla.turnOn();
//        tesla.go();
//        tesla.turnRight();
//        tesla.turnLeft();
//        tesla.stop();
//        System.out.println();
//
//        BMW bmw = new BMW("Bmw","2 series active tourer","1023");
//        System.out.println(bmw);
//        bmw.turnOn();
//        bmw.turnLeft();
//        bmw.turnRight();
//        bmw.go();
//        bmw.stop();
//        System.out.println();
//
//        Toyota toyota = new Toyota("Toyota","YARIS CROSS","5412");
//        System.out.println(toyota);
//        toyota.turnOn();
//        toyota.turnRight();
//        toyota.turnLeft();
//        toyota.go();
//        toyota.stop();
//        System.out.println();
    }
}
