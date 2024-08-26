// link do desafio: https://github.com/digitalinnovationone/trilha-java-basico/blob/main/desafios/sintaxe/README.md

import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int numero_conta;
        String agencia, nome_cliente;
        double saldo;

        System.out.println("--- Criar Conta ---");

        System.out.println("Por favor, insira o seu nome: ");
        nome_cliente = input.nextLine();

        System.out.println("Por favor, insira o numero da agencia: ");
        agencia = input.nextLine();

        System.out.println("Por favor, insira o numero da sua conta: ");
        numero_conta = input.nextInt();

        System.out.println("Por favor, insira o seu saldo: ");
        saldo = input.nextDouble();

        System.out.println("--- Conta Criada ---");
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque!", nome_cliente, agencia, numero_conta, saldo);

    }

}