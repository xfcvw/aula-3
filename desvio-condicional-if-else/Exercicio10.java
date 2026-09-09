import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;

        System.out.println("Digite o primeiro numero inteiro:");
        numero1 = entrada.nextInt();

        System.out.println("Digite o segundo numero inteiro:");
        numero2 = entrada.nextInt();

        System.out.println("Digite o terceiro numero inteiro:");
        numero3 = entrada.nextInt();

        if ((numero1 == numero2) && (numero2 == numero3)) {
            System.out.println("Os numeros sao iguais");
        } else if ((numero1 >= numero2) && (numero1 >= numero3)) {
            System.out.println("O maior numero e: " + numero1);
        } else if ((numero2 >= numero1) && (numero2 >= numero3)) {
            System.out.println("O maior numero e: " + numero2);
        } else {
            System.out.println("O maior numero e: " + numero3);
        }

        entrada.close();
    }
}
