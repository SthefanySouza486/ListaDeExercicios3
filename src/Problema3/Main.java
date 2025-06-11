package Problema3;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Primeiro valor: ");
            int a = entrada.nextInt();

            System.out.print("Segundo valor: ");
            int b = entrada.nextInt();

            System.out.print("Terceiro valor: ");
            int c = entrada.nextInt();

            MenorDeTres comparador = new MenorDeTres(a, b, c);

            System.out.println("MENOR = " + comparador.menor());

            entrada.close();
        }
    }

