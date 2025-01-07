import java.util.Scanner;

public class Ejercicio2 {
    private static Scanner scanner = new Scanner(System.in);

    // b
    public static int summatory(int number) {
        int res = 0;
        for (int i = 0; i < number; i++) {
            res+= i;
        }
        return res;
    }

    public static int askPossitive(String message) {
        int num;
        do {
            System.out.println(message);
            num = scanner.nextInt();
            scanner.nextLine();
            if (num <= 0) {
                System.out.println("El tamaño debe ser mayor que cero");
            }
        } while (num <= 0);
        return num;
    }

    // c
    public static double[] invert(double[] numbers) {
        double[] inverted = new double[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int newI = numbers.length - i - 1;
            inverted[newI] = numbers[i];
        }
        return inverted;
    }

    public static double[] askArray() {
        int size = askPossitive("Introduce el tamaño:");
        double[] numbers = new double[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Introduce un número:");
            numbers[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        return numbers;
    }

    public static void printArray(double[] numbers) {
        for (var number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        int option;
        do {
            System.out.println("Elige una opción:");
            System.out.println("1. Calcular sumatorio");
            System.out.println("2. Invertir array:");
            System.out.println("3. Salir");
            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                int number = askPossitive("Introduce un numero positivo");
                int res = summatory(number);
                System.out.println("El sumatorio es: " + res);
            } else if (option == 2) {
                double[] numbers = askArray();
                double[] inverted = invert(numbers);
                printArray(inverted);
            } else if (option == 3) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción inválida");
            }
        } while (option <= 3);
    }
}