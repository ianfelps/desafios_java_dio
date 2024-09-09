import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("--- Banco Digital ---");
        System.out.println("Insira o seu nome: ");
        String nome = input.nextLine();
        System.out.println("Insira o seu CPF: ");
        String cpf = input.nextLine();

        Cliente clienteAtual = new Cliente(nome, cpf);

        System.out.println();
        System.out.println("Ola " + clienteAtual.getNome() + ", vamos criar sua conta!");
        System.out.println("Insira o numero da agencia: ");
        int num_agencia = input.nextInt();
        System.out.println("Insira o numero da conta: ");
        int num_conta = input.nextInt();

        Conta contaAtual = new Conta(num_agencia, num_conta, clienteAtual);

        System.out.println();
        System.out.println("Conta criada com sucesso!");

        int opcao_menu = 0;

        while(opcao_menu != 5){
            
            System.out.println();
            System.out.println("Qual operacao deseja realizar?");
            System.out.println("1 - Consultar dados;");
            System.out.println("2 - Consultar saldo;");
            System.out.println("3 - Depositar;");
            System.out.println("4 - Sacar;");
            System.out.println("5 - Sair.");
            opcao_menu = input.nextInt();
            
            switch(opcao_menu){
                case 1:
                    System.out.println("--- Dados da Conta ---");
                    System.out.println("Nome: " + clienteAtual.getNome());
                    System.out.println("CPF: " + clienteAtual.getCpf());
                    System.out.println("Num. Agencia: " + contaAtual.getAgencia());
                    System.out.println("Num. Conta: " + contaAtual.getNumero());
                    break;
                case 2:
                    System.out.println("--- Saldo da Conta ---");
                    System.out.println("Saldo atual da conta: R$ " + contaAtual.consultarSaldo());
                    break;
                case 3:
                    System.out.println("--- Depositar ---");
                    System.out.println("Insira o valor para deposito: ");
                    double deposito = input.nextDouble();
                    contaAtual.depositar(deposito);
                    System.out.println("Deposito no valor de R$ " + deposito + " realizado com sucesso!");
                    break;
                case 4:
                    System.out.println("--- Sacar ---");
                    System.out.println("Insira o valor para saque: ");
                    double saque = input.nextDouble();
                    if (saque <= contaAtual.consultarSaldo()){
                        contaAtual.sacar(saque);
                        System.out.println("Saque no valor de R$ " + saque + " realizado com sucesso!");
                    } else {
                        System.out.println("Valor indisponivel na conta!");
                    }
                    break;
                case 5:
                    System.out.println("--- Ate logo! ---");
                    break;
                default:
                    System.out.println("Opcao Invalida!");
                    break;
            }
        }

    }

}