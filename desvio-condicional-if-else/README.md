# Lista de exercícios: desvio condicional `if-else`

Resoluções em Java baseadas nos exemplos da apresentação da disciplina de Algoritmos e Programação I.

## Arquivos

- `Exercicio01.java`: calcula a metade quando o número é maior que 20.
- `Exercicio02.java`: informa se a pessoa é maior ou menor de idade.
- `Exercicio03.java`: compara dois inteiros e calcula a diferença.
- `Exercicio04.java`: apresenta dois números em ordem decrescente.
- `Exercicio05.java`: verifica se um inteiro está entre 50 e 100.
- `Exercicio06.java`: calcula o peso ideal pela fórmula fornecida no slide.
- `Exercicio07.java`: calcula o bônus do funcionário.
- `Exercicio08.java`: verifica a senha `R10p5`.
- `Exercicio09.java`: verifica o limite da prestação do empréstimo.
- `Exercicio10.java`: encontra o maior de três inteiros.
- `Exercicio11.java`: informa a categoria do nadador.
- `Exercicio12.java`: calcula o desconto do INSS conforme a tabela do exercício.
- `Exercicio13.java`: executa uma operação de calculadora.
- `DesafioVotacao.java`: verifica se uma pessoa está apta a votar no Brasil.

## Como executar

Abra o terminal dentro desta pasta. Para compilar e executar um exercício, use:

```bash
javac Exercicio01.java
java Exercicio01
```

Troque `Exercicio01` pelo nome do arquivo desejado.

## Observações

No exercício 12, a última linha do slide aparece como `<= R$ 2.000,00` novamente. Para não repetir a faixa anterior, a solução considera a última alíquota para salários acima de R$ 2.000,00.

No desafio, o programa considera a idade no dia da eleição, nacionalidade brasileira, serviço militar obrigatório, alfabetização, regularidade do título e situação dos direitos políticos. De acordo com o TSE, o voto é obrigatório para brasileiros alfabetizados de 18 a 70 anos e facultativo para pessoas de 16 e 17 anos, maiores de 70 anos e pessoas analfabetas. Estrangeiros e conscritos durante o serviço militar obrigatório não podem se alistar.

Fontes oficiais consultadas:

- Tribunal Superior Eleitoral: https://www.tse.jus.br/servicos-eleitorais/glossario/termos/eleitor
- Constituição Federal, artigo 14: https://www.tse.jus.br/legislacao/compilada/constituicao-federal/1988/constituicao-federal-de-1988
