/*
Descrição
Implemente um programa que verifique se houve queda de conexão em um dia. A queda de conexão é definida como qualquer velocidade registrada igual a 0 Mbps. O sistema deve ler os registros de velocidade de conexão, processar os dados e determinar se ocorreu queda de conexão durante o dia.

Entrada
A entrada deve receber uma lista de valores inteiros representando a velocidade de conexão em Mbps separados por vírgulas.

Saída
Deverá retornar "Queda de Conexao" se houver pelo menos uma velocidade registrada igual a 0 Mbps, e "Sem Quedas" caso contrário.
*/

import java.util.Scanner;

public class QuedaConexao {

    // Função para verificar queda de conexão
    public static String verificarQuedaConexao(String[] velocidades) {
        
        for (String velocidade : velocidades) {
            if (Integer.parseInt(velocidade) == 0) {
                return "Queda de Conexao";
            }
        }
        
        return "Sem Quedas";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Verificando se houve queda de conexão
        String resultado = verificarQuedaConexao(velocidades);

        // Exibindo o resultado da verificação
        System.out.println(resultado);

        scanner.close();
    }
}