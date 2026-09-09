import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salario;
        double desconto;

        System.out.println("Digite o salario:");
        salario = entrada.nextDouble();

        if (salario <= 600.00) {
            desconto = 0;
        } else if (salario <= 1200.00) {
            desconto = salario * 0.20;
        } else if (salario <= 2000.00) {
            desconto = salario * 0.25;
        } else {
            desconto = salario * 0.30;
        }

        System.out.printf("Desconto do INSS: R$ %.2f%n", desconto);

        entrada.close();
    }
}
