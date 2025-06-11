package Problema12;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Hora inicial: ");
            int inicio = entrada.nextInt();

            System.out.print("Hora final: ");
            int fim = entrada.nextInt();

            DuracaoDoJogo jogo = new DuracaoDoJogo(inicio, fim);
            int duracao = jogo.calcularDuracao();

            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

            entrada.close();
        }
    }
