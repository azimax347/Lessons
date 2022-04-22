public class Урок_5 {

    public static void main(String[] args) {
        int test = 1000;
        int test2 = 1;
        int test3 = 0;

        for (int i = 1; i < 9; i++) { // Цикл for ([инициализация счетчика]; [условие]; [изменение счетчика])

            int x = test + 10;
            System.out.print(x + " ");
            test = x;

        }

        do { /*
              * сначала выполняет код цикла, а потом проверяет условие в инструкции while.
              * И пока это условие истинно, цикл повторяется.
              */
            System.out.print("\n" + test2);
            test2++;
        } while (test2 <= 10);

        while (test3 >= -10) { /*
                                * Цикл while сразу проверяет истинность некоторого условия, и если условие
                                * истинно,
                                * то код цикла выполняется
                                */
            System.out.print("\n" + test3);
            test3--;

        }

    }

}
