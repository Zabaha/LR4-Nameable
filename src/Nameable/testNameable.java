package Nameable;

public class testNameable {

    public static void main(String[] args) {
        Nameable h1 = new Human("Александр", 21);
        Nameable p1 = new Pets("Сёма", "кот");
        Nameable c1 = new Car("Tesla", "белый");
        System.out.println(h1.getName());
        System.out.println(h1.info());
        System.out.println(p1.getName());
        System.out.println(p1.info());
        System.out.println(c1.getName());
        System.out.println(c1.info());
    }
}
