import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countBelowZero = 0;

        System.out.println("Введите температуры за 30 дней (через пробел):");
        for (int i = 0; i < 30; i++) {
            int temp = scanner.nextInt();
            if (temp < 0) {
                countBelowZero++;
            }
        }

        System.out.println("Количество дней с температурой ниже 0°C: " + countBelowZero);
    }
}

