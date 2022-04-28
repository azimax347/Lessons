public class Урок_10 {
    static void main(String[] args) {
        Person per1 = new Person(); // ? Создание объекта per1
        per1.name = "Marshall";
        per1.age = 25;
        System.out.println(per1.name);
    }

}

class Person {
    String name;
    int age;

}