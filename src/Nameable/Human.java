package Nameable;

public class Human implements Nameable{
    private String name;
    private int age;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String info(){
        return "Имя: " + name + "; возрвст: " + age;
    }
}
