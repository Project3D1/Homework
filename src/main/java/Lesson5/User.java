package lesson5;

public class User {

    private int id;
    private String name;
    public static String position;
    protected int age;

    public User(int id, String name, String position, int age) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.age = age;
    }

    public void info() {
//        System.out.println(position);
//        printPosition();
        System.out.println("id: " + id + "; Имя пользователя: " + name + "; Должность: " + position + "; Возраст: " + age);
    }

    public static void printPosition() {
//        System.out.println(age);
    }

    public void changePosition(String position) {
        this.position = position;
        System.out.println("Пользователь " + name + " получил новую должность: " + position);
    }

    public static void main(String[] args) {
        User user1 = new User(1, "Oleg", "Software Engineer", 28);
        User user2 = new User(2, "Pavel", "Software Engineer", 27);
        user1.info();
        user2.info();
        System.out.println("-----------");
        user1.changePosition("Boss");
        System.out.println("-----------");
        user1.info();
        user2.info();

        System.out.println(User.position);
    }
}