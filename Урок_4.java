import java.util.Scanner;

public class Урок_4 {
    public static void main(String[] args) {

        Scanner skan = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x = skan.nextInt();
        System.out.println("Введите второе число");
        int y = skan.nextInt();

        if (x > y) {
            System.out.println("Первое число больше второго \n");
        } else {
            System.out.println("Второе число больше первого \n");
        }

        System.out.println("Введите третье число");
        int z = skan.nextInt();
        switch (z) {

            case 1:
                System.out.println("Число равно 1");
                break;
            case 2:
                System.out.println("Число равно 2");
                break;
            default:
                System.out.println("Число равно " + z);
        }

    }
}
