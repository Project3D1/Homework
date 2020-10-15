package Homework5;

public class Employee {
    String lastname;
    String name;
    String patronymic;
    String position;
    String email;
    int salary;
    int age;

    public Employee (String lastname,String name, String patronymic, String position, String email,int salary, int age) {
        this.lastname = lastname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("ФИО: " + lastname + " " + name + " " + patronymic + ";" + "Должность: " + position+ ";" + "Электронная почта: " + email + ";" + "Заработная плата: " + salary + ";" + "Возраст: " + age + ".");

    }

    int getAge() {
        return age;
    }

}
