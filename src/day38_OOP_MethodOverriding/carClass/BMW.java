package day38_OOP_MethodOverriding.carClass;

public class BMW extends Car {

    public BMW( String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }


    public void breaksDown() {
        System.out.println(brand + " "+model + " is breaking down.");
    }
    public void racing(){
        System.out.println(brand + " " + model + " is racing.");
    }

    @Override
    public void start() {
        System.out.println("Call the mechanic to start "+brand + " "+ model);
    }
}
/*
2. BMW:
extra methods:
breaksDown()
racing()
 */