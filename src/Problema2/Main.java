package Problema2;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Coeficiente a: ");
            double a = entrada.nextDouble();

            System.out.print("Coeficiente b: ");
            double b = entrada.nextDouble();

            System.out.print("Coeficiente c: ");
            double c = entrada.nextDouble();

            Bhaskara equacao = new Bhaskara(a, b, c);

            if (equacao.temRaizesReais()) {
                double x1 = equacao.calcularX1();
                double x2 = equacao.calcularX2();
                System.out.printf("X1 = %.4f%n", x1);
                System.out.printf("X2 = %.4f%n", x2);
            } else {
                System.out.println("Esta equação não possui raizes reais");
            }

            entrada.close();
        }
    }

