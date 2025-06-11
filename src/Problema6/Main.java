package Problema6;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite a medida da glicose: ");
            double medida = entrada.nextDouble();

            MedidorGlicose medidor = new MedidorGlicose(medida);
            String classificacao = medidor.classificar();

            System.out.println("Classificacao: " + classificacao);

            entrada.close();
        }
    }
