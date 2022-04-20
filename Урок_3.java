import java.util.Scanner;

public class Урок_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целой число");
        int num = in.nextInt();

        System.out.printf("Твоё число: %d", num);
        in.close();

    }

}
