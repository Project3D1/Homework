package Homework5;

public class List {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Иванов", "Иван", "Иванович", "Генеральный директор", "III@mail.ru", 250000, 41);
        employeeArray[1] = new Employee("Огурцов", "Николай", "Николаевич", "Заместитель генерального директора", "ONN@mail.ru", 200000, 37);
        employeeArray[2] = new Employee("Бастрыгина", "Мария", "Петровна",  "Главный бухгалтер", "BMP@mail.ru", 170000, 50);
        employeeArray[3] = new Employee("Сухоруков","Виктор","Генадьевич","Старший менеджер","SVG@mail.ru",100000, 35);
        employeeArray[4] = new Employee("Одинцов","Александр","Анатольевич","Инженер","", 75000,44);

        for (Employee a : employeeArray) if (a.getAge() > 40) a.info();
    }


}
