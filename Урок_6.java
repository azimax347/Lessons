import java.lang.Math;

public class Урок_6 {
    public static void main(String[] args) {

        int mas[] = new int[5]; // ? Объявление и инициализация массива
        // int mas2[] = new int[] { 9, 83, 7, 6, 5 }; // ? Объявление, инициализация,
        // заполнение одномерного массива
        int mas4[][] = new int[10][10];
        mas[0] = 4; // * Обращение к конкретному элементу массиву
        mas[1] = 3;
        mas[2] = 2;
        mas[3] = 1;
        mas[4] = 0;

        // int len = mas2.length; // Определение длины массива
        // int last = mas2[mas2.length - 1]; // Определение последнего элемента массива

        int mas3[][] = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } }; // ? Объявление, инициализация, заполнение
                                                                              // ? двумерного массива

        /*
         * int mas5[][][] = new int[][][] { { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } },
         * { { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } } };
         */ // ? Объявление, инициализация, заполнение
            // ? трёхмерного массива

        for (int i : mas) { // * Цикл foreach для массива
            System.out.print(i + " ");
        }

        System.out.println("\n");

        for (int i = 0; i < mas.length; i++) { // * Цикл for для одномерного массива
            mas[i] = mas[i] * 4;
            System.out.print(mas[i] + " ");

        }

        System.out.println("\n");

        for (int i = 0; i < mas3.length; i++) { // * Вывод двумерного массива
            for (int j = 0; j < mas3[i].length; j++) {
                System.out.printf("%d ", mas3[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n");

        for (int i = 0; i < mas4.length; i++) { // * Заполнение двумерного массива числами от 0 до 50 + вывод
            for (int j = 0; j < mas4[i].length; j++) {
                mas4[i][j] = (int) (Math.random() * (50 + 1));
                System.out.printf("%d ", mas4[i][j]);

            }
            System.out.println();

        }

    }

}
