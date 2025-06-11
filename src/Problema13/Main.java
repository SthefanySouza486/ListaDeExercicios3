package Problema13;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Valor de X: ");
            double x = entrada.nextDouble();

            System.out.print("Valor de Y: ");
            double y = entrada.nextDouble();

            CoordenadasCartesianas ponto = new CoordenadasCartesianas(x, y);
            String localizacao = ponto.determinarLocalizacao();

            System.out.println(localizacao);

            entrada.close();
        }
    }
