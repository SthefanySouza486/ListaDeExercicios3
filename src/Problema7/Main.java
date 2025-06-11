package Problema7;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite as tres distancias:");
            double d1 = entrada.nextDouble();
            double d2 = entrada.nextDouble();
            double d3 = entrada.nextDouble();

            LancamentoDeDardo lancamento = new LancamentoDeDardo(d1, d2, d3);
            double maior = lancamento.maiorDistancia();

            System.out.printf("MAIOR DISTANCIA = %.2f\n", maior);

            entrada.close();
        }
    }

