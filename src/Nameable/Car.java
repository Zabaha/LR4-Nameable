package Nameable;

public class Car implements Nameable{

    private String name;
    private String color;

    public Car(String name, String color){
        this.name = name;
        this.color = color;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String info() {
        return "Название марки: " + name + "; цвет: " + color;
    }
}
