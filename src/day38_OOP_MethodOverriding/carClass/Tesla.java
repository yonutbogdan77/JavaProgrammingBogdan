package day38_OOP_MethodOverriding.carClass;

public class Tesla extends Car{
    public Tesla(String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }
    public  void autoPilot(){
        System.out.println(brand + " "+ model + " is in autoPilot mode");
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" for starting "+brand + " "+ model);
    }
}
/*
3. Tesla:
extra methods:
autoPilot();
 */