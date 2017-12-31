import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int x = scanner.nextInt();
        int count = 1;
        for (int i = 1; i < x; i++) {
            if ((x % i) == 0) {
                System.out.println("Делители числа " + x + ": " + i);
                count++;
            }
        }
        System.out.println("Делители числа " + x + ": " + x);
        System.out.println("Количество делителей " + count);

    }
}
