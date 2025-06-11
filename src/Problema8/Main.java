package Problema8;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
            char escala = entrada.next().toUpperCase().charAt(0);

            if (escala == 'F') {
                System.out.print("Digite a temperatura em Fahrenheit: ");
                double f = entrada.nextDouble();
                double c = ConversorDeTemperatura.fahrenheitParaCelsius(f);
                System.out.printf("Temperatura equivalente em Celsius: %.2f\n", c);
            } else if (escala == 'C') {
                System.out.print("Digite a temperatura em Celsius: ");
                double c = entrada.nextDouble();
                double f = ConversorDeTemperatura.celsiusParaFahrenheit(c);
                System.out.printf("Temperatura equivalente em Fahrenheit: %.2f\n", f);
            } else {
                System.out.println("Escala inválida. Use apenas C ou F.");
            }
            entrada.close();
        }
    }

