public class Урок_9 {
    public static void main(String[] args) {
        System.out.println(fac(50));
    }

    static int fac(int x) {
        if (x < 0) {
            return 0;
        }

        if (x == 1) {
            return 1;
        }
        return x * fac(x - 1);
    }
}
