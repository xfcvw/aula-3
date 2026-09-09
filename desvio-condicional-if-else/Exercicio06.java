import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double altura;
        double pesoIdeal;
        char sexo;

        System.out.println("Digite a altura em metros:");
        altura = entrada.nextDouble();

        System.out.println("Digite M para masculino ou F para feminino:");
        sexo = entrada.next().toUpperCase().charAt(0);

        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("Peso ideal: %.2f kg%n", pesoIdeal);
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("Peso ideal: %.2f kg%n", pesoIdeal);
        } else {
            System.out.println("Sexo invalido");
        }

        entrada.close();
    }
}
