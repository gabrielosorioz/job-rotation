import java.util.Scanner;

public class InverterString {

    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int inicio = 0;
        int fim = str.length() - 1;

        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            inicio++;
            fim--;
        }

        return new String(caracteres);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();

       
        String resultado = inverterString(entrada);

        
        System.out.println("String invertida: " + resultado);

        scanner.close();
    }
}
