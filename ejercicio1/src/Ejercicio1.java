import java.util.Scanner;

public class Ejercicio1 {
    private static Scanner scanner = new Scanner(System.in);

    // a
    public static int askSize() {
        int num;
        do {
            System.out.println("Introduce el tamaño:");
            num = scanner.nextInt();
            scanner.nextLine();
            if (num <= 0) {
                System.out.println("El tamaño debe ser mayor que cero");
            }
        } while (num <= 0);
        return num;
    }

    // b
    public static double[] askArray() {
        int size = askSize();
        double[] numbers = new double[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Introduce un número:");
            numbers[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        return numbers;
    }

    // c
    public static double average (double[] numbers1, double[] numbers2) {
        double sum = 0;
        for (var number : numbers1) {
            sum+= number;
        }

        for (var number : numbers2) {
            sum+= number;
        }
        return sum / (numbers1.length + numbers2.length);
    }

    // d
    public static void printArray(double average) {
        System.out.println("La media es: " + average);
    }

    // e
    public static void main(String[] args) {
        double[] numbers1 = askArray();
        double[] numbers2 = askArray();

        double average = average(numbers1, numbers2);

        printArray(average);
    }
}
