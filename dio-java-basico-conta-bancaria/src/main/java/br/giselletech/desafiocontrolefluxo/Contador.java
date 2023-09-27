package br.giselletech.desafiocontrolefluxo;

import java.util.Locale;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Digite um número: ");
            int paramUm = scanner.nextInt();

            System.out.println("Digite outro número: ");
            int paramDois = scanner.nextInt();

            contar(paramUm, paramDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }

    static void contar(int paramUm, int paramDois) throws ParametrosInvalidosException {
        if (paramUm > paramDois ) {
            throw new ParametrosInvalidosException();
        }

        int contagem = paramDois - paramUm;

        for (int i = 1 ; i <= contagem ; i++){
            System.out.println("Imprimindo número " + i);
        }
    }
}
