import java.util.Scanner;

// Exercício com printf - Tabuada do 5
class ExercicioTabuada {
    public static void main(String[] args) {
        int numero = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", numero, i, numero * i);
        }
    }
}

// Exercício 1
class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("Nome completo: Vinicius");
        System.out.println("RA: COLOQUE_SEU_RA_AQUI");
        System.out.println("Curso: Análise e Desenvolvimento de Sistemas");
    }
}

// Exercício 2
class Exercicio2 {
    public static void main(String[] args) {
        int idade = 0; // Troque pela sua idade
        double altura = 0.0; // Troque pela sua altura em metros
        String status = "Presente";

        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Status na aula: " + status);
    }
}

// Exercício 3
class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = entrada.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int numero2 = entrada.nextInt();

        int produto = numero1 * numero2;

        System.out.println("Produto: " + produto);
        entrada.close();
    }
}

// Exercício 4
class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = entrada.nextInt();
        System.out.println("Digite o segundo número:");
        int numero2 = entrada.nextInt();
        System.out.println("Digite o terceiro número:");
        int numero3 = entrada.nextInt();
        System.out.println("Digite o quarto número:");
        int numero4 = entrada.nextInt();

        int soma = numero1 + numero2 + numero3 + numero4;

        System.out.println("Soma: " + soma);
        entrada.close();
    }
}

// Exercício 5
class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota:");
        double nota2 = entrada.nextDouble();
        System.out.println("Digite a terceira nota:");
        double nota3 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Média aritmética: %.2f%n", media);
        entrada.close();
    }
}

// Exercício 6
class Exercicio6 {
    public static void main(String[] args) {
        double expressao1 = (20.0 - 15) / 2;
        double expressao2 = Math.pow(2, 5.0 / 20) + 30.0 / Math.pow(15, 2);
        double expressao3 = 35.0 / (6 + 2);
        int expressao4 = 23 % 4;

        System.out.println("(20 - 15) / 2 = " + expressao1);
        System.out.println("2^(5/20) + 30/(15^2) = " + expressao2);
        System.out.println("35 / (6 + 2) = " + expressao3);
        System.out.println("23 módulo 4 = " + expressao4);
    }
}

// Exercício 7
class Exercicio7 {
    public static void main(String[] args) {
        boolean resultado1 = (120 - 30) == Math.pow(3, 30);
        boolean resultado2 = !((20 % 4) == 1) || (9 != 9);
        boolean resultado3 = (5 % 2) > 3;
        boolean resultado4 = 'a' == 'A';

        System.out.println("(120 - 30) == 3^30: " + resultado1);
        System.out.println("!((20 % 4) == 1) || (9 != 9): " + resultado2);
        System.out.println("(5 % 2) > 3: " + resultado3);
        System.out.println("'a' == 'A': " + resultado4);
    }
}

// Exercício 8
class Exercicio8 {
    public static void main(String[] args) {
        double nota1 = 8.0;
        double nota2 = 7.5;
        double nota3 = 4.5;
        double nota4 = 9.0;

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("Média das notas: %.2f%n", media);
    }
}

// Exercício 9
class Exercicio9 {
    public static void main(String[] args) {
        double lado = 350;
        double area = lado * lado;

        System.out.println("Área do quadrado: " + area + " m²");
    }
}

// Exercício 10
class Exercicio10 {
    public static void main(String[] args) {
        double pi = 3.14159;
        double raio = 5;
        double area = pi * Math.pow(raio, 2);

        System.out.printf("Área do círculo: %.2f cm²%n", area);
    }
}

// Exercício 11
class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento:");
        int anoNascimento = entrada.nextInt();
        System.out.println("Digite o ano atual:");
        int anoAtual = entrada.nextInt();

        int idade = anoAtual - anoNascimento;
        int idadeEm2030 = 2030 - anoNascimento;

        System.out.println("Idade atual: " + idade + " anos");
        System.out.println("Idade em 2030: " + idadeEm2030 + " anos");
        entrada.close();
    }
}

// Exercício 12
class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número:");
        double numero = entrada.nextDouble();

        double quadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);
        double raizQuadrada = Math.sqrt(numero);
        double potencia10 = Math.pow(numero, 10);

        System.out.println("Número ao quadrado: " + quadrado);
        System.out.println("Número ao cubo: " + cubo);
        System.out.println("Raiz quadrada: " + raizQuadrada);
        System.out.println("Número elevado a 10: " + potencia10);
        entrada.close();
    }
}
