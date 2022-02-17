public class Main {
    public static void main(String[] args) {
        Tesla tesla = new Tesla("Tesla","Tesla Model X","3215");
        System.out.println(tesla);
        tesla.turnOn();
        tesla.go();
        tesla.turnRight();
        tesla.turnLeft();
        tesla.stop();
        System.out.println();

        BMW bmw = new BMW("Bmw","2 series active tourer","1023");
        System.out.println(bmw);
        bmw.turnOn();
        bmw.turnLeft();
        bmw.turnRight();
        bmw.go();
        bmw.stop();
        System.out.println();

        Toyota toyota = new Toyota("Toyota","YARIS CROSS","5412");
        System.out.println(toyota);
        toyota.turnOn();
        toyota.turnRight();
        toyota.turnLeft();
        toyota.go();
        toyota.stop();
        System.out.println();
    }
}
