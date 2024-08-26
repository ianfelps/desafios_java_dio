// link do desafio: https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/controle-fluxo

import java.util.Scanner;

public class ControleFluxo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int parametroUm, parametroDois;

        System.out.println("--- Contador de Fluxo ---");

        System.out.println("Digite o primeiro parametro: ");
        parametroUm = input.nextInt();

        System.out.println("Digite o segundo parametro: ");
        parametroDois = input.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("--- Erro ---");
            System.out.println("O segundo parametro deve ser maior que o primeiro.");

        }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        System.out.println("--- Contagem ---");

        for (int i = 0; i <= contagem; i++) {
            System.out.printf("%d   ", parametroUm + i);
        }

    }
}

class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException() {
        super("Parâmetros inválidos: o segundo parâmetro deve ser maior que o primeiro.");
    }
}