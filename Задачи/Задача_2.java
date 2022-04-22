package Задачи;

public class Задача_2 {
    public static void main(String[] args) {
        int d = 1;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                d = i * j;
                System.out.printf("%d\t", d);
            }
            System.out.println();

        }
    }

}
