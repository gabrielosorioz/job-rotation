import java.util.Scanner;

public class FibonacciVerifier {

    public static boolean isFibonacci(int number) {
        int a = 0, b = 1, sum;

        while (true) {
            if (number == a || number == b) {
                return true;
            } else if (number < a + b) {
                return false;
            }

            sum = a + b;
            a = b;
            b = sum;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
