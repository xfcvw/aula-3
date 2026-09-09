import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salario;
        double bonus;
        int anosTrabalhados;

        System.out.println("Digite o salario do funcionario:");
        salario = entrada.nextDouble();

        System.out.println("Digite a quantidade de anos trabalhados:");
        anosTrabalhados = entrada.nextInt();

        if (anosTrabalhados >= 5) {
            bonus = salario * 0.20;
        } else {
            bonus = salario * 0.10;
        }

        System.out.printf("Valor do bonus: R$ %.2f%n", bonus);

        entrada.close();
    }
}
