import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salarioBruto;
        double prestacao;
        double limitePrestacao;

        System.out.println("Digite o salario bruto:");
        salarioBruto = entrada.nextDouble();

        System.out.println("Digite o valor da prestacao:");
        prestacao = entrada.nextDouble();

        limitePrestacao = salarioBruto * 0.30;

        if (prestacao <= limitePrestacao) {
            System.out.println("Emprestimo pode ser concedido!");
        } else {
            System.out.println("Emprestimo nao pode ser concedido!");
        }

        entrada.close();
    }
}
