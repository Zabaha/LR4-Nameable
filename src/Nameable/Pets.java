package Nameable;

public class Pets implements Nameable{
    private String name;
    private String kindOfPet;

    public Pets(String name, String kindOfPet){
        this.name = name;
        this.kindOfPet = kindOfPet;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String info() {
        return "Имя: " + name + "; Вид: " + kindOfPet;
    }
}
