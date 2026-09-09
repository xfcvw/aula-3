import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double numero1;
        double numero2;
        double resultado;
        char operacao;

        System.out.println("Digite o primeiro numero:");
        numero1 = entrada.nextDouble();

        System.out.println("Digite o segundo numero:");
        numero2 = entrada.nextDouble();

        System.out.println("Digite a operacao (+, -, * ou /):");
        operacao = entrada.next().charAt(0);

        if (operacao == '+') {
            resultado = numero1 + numero2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao == '-') {
            resultado = numero1 - numero2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao == '*') {
            resultado = numero1 * numero2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao == '/') {
            if (numero2 > 0) {
                resultado = numero1 / numero2;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Impossivel dividir!");
            }
        } else {
            System.out.println("Sinal invalido");
        }

        entrada.close();
    }
}
