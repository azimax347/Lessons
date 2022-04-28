import java.util.Scanner;

public class урок_10 {

    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        System.out.println("Выберите способ. \n 1 - Без ключевого слова \n 2 - С ключевым словом this");
        final int nom = skan.nextInt();
        if (nom == 1 || nom == 2) {
            test1(nom);
        }

        else {
            System.out.println("Ошибка");
        }

    }

    static void test1(int x) {
        if (x == 1) {
            Person per1 = new Person();
            per1.Info();
            Person per2 = new Person("Jude");
            per2.Info();
            Person per3 = new Person("Alexandra", 19);
            per3.Info();
        } else {
            test2();
        }

    }

    static void test2() {

        Person2 per1 = new Person2();
        per1.Info();
        Person2 per2 = new Person2("Laurianne");
        per2.Info();
        Person2 per3 = new Person2("America", 39);
        per3.Info();

    }

}

class Person {

    String name;
    int age;

    Person() {
        age = 15;
    }

    Person(String x) {
        name = x;
        age = 17;
    }

    Person(String x, int y) {
        name = x;
        age = y;
    }

    void Info() {
        System.out.printf("Имя: %s \tВозраст: %d\n", name, age);

    }
}

class Person2 {
    String name;
    int age;

    Person2() {
        this("Ошибка", 25);
    }

    Person2(String name) {
        this(name, 28);
    }

    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void Info() {
        System.out.printf("Имя: %s \tВозраст: %d\n", name, age);

    }

}