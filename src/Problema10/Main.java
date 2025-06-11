package Problema10;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite dois numeros inteiros:");
            int num1 = entrada.nextInt();
            int num2 = entrada.nextInt();

            Multiplos multiplo = new Multiplos(num1, num2);

            if (multiplo.saoMultiplos()) {
                System.out.println("Sao multiplos");
            } else {
                System.out.println("Nao sao multiplos");
            }

            entrada.close();
        }
    }
