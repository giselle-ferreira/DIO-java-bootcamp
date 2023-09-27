package com.giselletech.proj;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o número da sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Informe seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente
                + ", \nOrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ",conta " + numeroConta + " e seu saldo R$" + saldo
                + " já está disponível para saque");
    }
}