import java.util.Scanner;

public class Урок_3 {
    public static void main(String[] args) {

        Scanner novi = new Scanner(System.in); // Объявление сканера с названием "novi"
        System.out.println("Число больше 10 ?");
        String z = novi.nextLine();
        System.out.println("Твой ответ" + z);
        System.out.println("Введите первое число: ");
        int x = novi.nextInt(); // Считывание целого числа с консоли
        System.out.println("Введите второе число: ");
        int y = novi.nextInt();
        System.out.printf("Твоё число: %d \n", x + y);
        novi.close();
    }

}
