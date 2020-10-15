package Homework7;

import java.sql.SQLOutput;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Barsik", 5), new Cat("Murzik", 13), new Cat("Tuzik",25)};
        Plate plate = new Plate(100);
        for (Cat c : cats) {
            System.out.println(c);
        }
        System.out.println("\n" + plate);
        System.out.println("increase food by 100");
        plate.increaseFood(100);
        System.out.println(plate);
        System.out.println("Cats take food:");
        for (Cat c : cats) {
            c.eat(plate);
            System.out.println(c);
            System.out.println(plate);
        }
    }
}
