import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero inteiro:");
        numero = entrada.nextInt();

        if (numero > 20) {
            double metade = numero / 2.0;
            System.out.println("A metade do numero e: " + metade);
        }

        entrada.close();
    }
}
