package Problema9;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Codigo do produto comprado: ");
            int codigo = entrada.nextInt();

            System.out.print("Quantidade comprada: ");
            int quantidade = entrada.nextInt();

            try {
                double total = Lanchonete.calcularTotal(codigo, quantidade);
                System.out.printf("Valor a pagar: R$ %.2f\n", total);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            entrada.close();
        }
    }
