package com.marcosviniciusdev;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        int conta = sc.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = sc.next();

        System.out.println("Por favor, digite o seu nome: ");
        String nome = sc.next();

        System.out.println("Por favor, digite o seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nome, agencia, conta, saldo);

        sc.close();
    }

}
