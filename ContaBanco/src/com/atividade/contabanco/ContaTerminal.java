package com.atividade.contabanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();


        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo!");
        double saldo = scanner.nextDouble();

        // Criar a conta com os dados inseridos
        ContaBanco conta = new ContaBanco(numero, agencia, nomeCliente, saldo);

        // Exibir a mensagem final
        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque.");
        
        scanner.close();
    }
}
