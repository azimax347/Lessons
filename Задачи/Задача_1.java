
package Задачи;

import java.util.Scanner;

public class Задача_1 {

    public static void main(String[] args) {
        int x = 10000000;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число рождаемости в год на тысячу человек: ");
        int y = scan.nextInt();
        System.out.println("Введите число смертности в год на тысячу человек7");
        int z = scan.nextInt();
        scan.close();
        int q = y - z;
        for (int i = 1; i <= 10; i++) {
            x += x * q / 1000;
            System.out.println("Год " + i + " - " + x);

        }

    }

}
