import java.util.Scanner;

public class DesafioVotacao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int idade;
        char brasileiro;
        char conscrito;
        char alfabetizado;
        char tituloRegular;
        char direitosPoliticosAtivos;

        System.out.println("Digite a idade que a pessoa tera no dia da eleicao:");
        idade = entrada.nextInt();

        System.out.println("A pessoa possui nacionalidade brasileira? (S/N)");
        brasileiro = entrada.next().toUpperCase().charAt(0);

        System.out.println("A pessoa esta cumprindo o servico militar obrigatorio? (S/N)");
        conscrito = entrada.next().toUpperCase().charAt(0);

        System.out.println("A pessoa e alfabetizada? (S/N)");
        alfabetizado = entrada.next().toUpperCase().charAt(0);

        System.out.println("A pessoa possui titulo eleitoral regular? (S/N)");
        tituloRegular = entrada.next().toUpperCase().charAt(0);

        System.out.println("A pessoa esta com os direitos politicos ativos? (S/N)");
        direitosPoliticosAtivos = entrada.next().toUpperCase().charAt(0);

        if (idade < 16) {
            System.out.println("A pessoa nao esta apta a votar: idade inferior a 16 anos.");
        } else if (brasileiro != 'S') {
            System.out.println("A pessoa nao esta apta a votar: estrangeiros nao podem se alistar.");
        } else if (conscrito == 'S') {
            System.out.println("A pessoa nao esta apta a votar durante o servico militar obrigatorio.");
        } else if (tituloRegular != 'S') {
            System.out.println("A pessoa nao esta apta a votar: titulo eleitoral irregular ou inexistente.");
        } else if (direitosPoliticosAtivos != 'S') {
            System.out.println("A pessoa nao esta apta a votar: direitos politicos suspensos.");
        } else if ((idade >= 18) && (idade <= 70) && (alfabetizado == 'S')) {
            System.out.println("A pessoa esta apta a votar e o voto e obrigatorio.");
        } else {
            System.out.println("A pessoa esta apta a votar e o voto e facultativo.");
        }

        entrada.close();
    }
}
