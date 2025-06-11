package Problema4;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite a quantidade de minutos: ");
            int minutos = entrada.nextInt();

            PlanoDeTelefonia plano = new PlanoDeTelefonia(minutos);
            double valor = plano.calcularValorAPagar();

            System.out.printf("Valor a pagar: R$ %.2f\n", valor);

            entrada.close();
        }
    }
