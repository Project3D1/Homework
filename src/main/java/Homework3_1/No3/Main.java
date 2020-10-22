package Homework3_1.No3;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();

        Apple a1 = new Apple();
        Apple a2 = new Apple();
        Orange o1 = new Orange();
        Orange o2 = new Orange();

        System.out.println("1 яблоко весит: " + a1.getWeight());
        System.out.println("1 апельсин весит: " + o1.getWeight() + "\n");

        System.out.println("Добавляем 2 яблока и 2 апельсина");

        appleBox1.addFruit(a1);
        appleBox1.addFruit(a2);
        orangeBox2.addFruit(o1);
        orangeBox2.addFruit(o2);

        System.out.println("AppleBox1 весит: " + appleBox1.getWeight());
        System.out.println("OrangeBox2 весит: " + orangeBox2.getWeight());

        System.out.println("Сравнения веса коробок: " + appleBox1.compare(orangeBox2) + "\n");

        Box<Apple> appleBox2 = new Box<Apple>();

        System.out.println("Вес коробки с яблоками до замены: ");
        System.out.println("appleBox1 весит: " + appleBox1.getWeight());
        System.out.println("appleBox2 весит: " + appleBox2.getWeight());
        System.out.println("\nЗаменяем applebox1 -> applebox2\n");
        appleBox1.replaceAllFruitsToOtherBox(appleBox2);
        System.out.println("Вес коробки с яблоками после замены: ");
        System.out.println("appleBox1 весит: " + appleBox1.getWeight());
        System.out.println("appleBox2 весит: " + appleBox2.getWeight());

    }
}
