/*
Descrição
Implemente um sistema para monitorar o uso de crédito em ligações telefônicas. Cada ligação consome uma quantidade de crédito de acordo com a sua duração e o tipo da ligação (local, nacional ou internacional). Desenvolva uma função que calcule o consumo de crédito de um cliente baseado nas suas ligações.

Cada ligação é representada por um triplo de valores: a duração da ligação (em minutos), o tipo da ligação e o valor do crédito por minuto de acordo com o tipo de ligação.

Entrada
A entrada deverá receber:
- Um número inteiro n, representando o número de ligações.
- Para cada ligação, uma linha contendo os valores a seguir separados por vírgula:
- - Um número inteiro representando a duração da ligação em minutos.
- - Uma string representando o tipo da ligação (local, nacional, ou internacional).
- - Um número decimal representando o valor do crédito por minuto para aquele tipo de ligação.

Saída
A função deverá retornar o consumo total de crédito em uma única linha. O resultado deve ser um número decimal com duas casas decimais.
*/

import java.util.Scanner;

public class Consumo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Processa múltiplos casos de teste
        while (scanner.hasNextLine()) {
            // Lê o número de ligações
            int n = Integer.parseInt(scanner.nextLine().trim());
            double totalCredito = 0.0;

            // Processa cada ligação
            for (int i = 0; i < n; i++) {
                String[] dadosLigacao = scanner.nextLine().trim().split(",");
                int duracao = Integer.parseInt(dadosLigacao[0].trim());
                String tipoLigacao = dadosLigacao[1].trim();
                double valorPorMinuto = Double.parseDouble(dadosLigacao[2].trim());

                // Calculo do custo da ligação
                double custoLigacao = duracao * valorPorMinuto;

                // Adiciona ao total de crédito
                totalCredito += custoLigacao;
            }

            // Formata o resultado com duas casas decimais e imprime
            System.out.printf("%.2f%n", totalCredito);
        }

        scanner.close();
    }
}