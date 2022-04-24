package Задачи;

import java.util.Scanner;

public class Задача_2 {
    public static void main(String[] args) {
        int d = 1;
        Scanner skan = new Scanner(System.in);
        System.out.print("Число строк: ");
        int x = skan.nextInt();
        System.out.print("Число столбов: ");
        int y = skan.nextInt();
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                d = i * j;
                System.out.printf("%d\t", d);
            }
            System.out.println();
        }
        skan.close();
    }

}
