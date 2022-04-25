import java.util.Scanner;

public class Урок_8 {
    public static void main(String args[]) {
        Scanner skan = new Scanner(System.in);
        System.out.print("Текущее время (часы): ");
        int time = skan.nextInt();
        System.out.println(test1(time)); // * Вывод возвращённого текста, при вводе параметра в ( )
        skan.close();
        System.out.println(over(4, 5));
        System.out.println(over(4, 5, 10));
        System.out.println(over(4.345, 5.121));

    }

    static String test1(int hour) { // ? Метод, возвращающий тип String, имеет параметр int
        if (hour > 24 || hour < 0) { // ? Условие с параметром
            return "Время неправильное"; // ? Возвращает текст в " ", при выполнение условия
        } else if (hour > 21 || hour < 6) {
            return "Доброй ночи";
        } else if (hour >= 15) {
            return "Добрый вечер";
        } else if (hour >= 11) {
            return "Добрый день";
        } else {
            return "Доброе утро";
        }

    }

    static int over(int x, int y) { // ? Первая Перегрузка метода
        return x + y;
    }

    static double over(double x, double y) { // ? Вторая Перегрузка метода
        return x * y;
    }

    static int over(int x, int y, int z) { // ? Третья Перегрузка метода

        return x / y * z;
    }
}