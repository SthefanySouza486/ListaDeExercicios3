package Problema1;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite a primeira nota: ");
            double nota1 = entrada.nextDouble();

            System.out.print("Digite a segunda nota: ");
            double nota2 = entrada.nextDouble();

            Nota aluno = new Nota(nota1, nota2);

            double notaFinal = aluno.calcularNotaFinal();

            System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
            if (aluno.estaReprovado()) {
                System.out.println("REPROVADO");
            }

            entrada.close();
        }
    }

