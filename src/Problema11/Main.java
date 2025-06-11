package Problema11;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite o salario da pessoa: ");
            double salario = entrada.nextDouble();

            AumentoSalarial funcionario = new AumentoSalarial(salario);
            double aumento = funcionario.calcularAumento();
            double novoSalario = funcionario.calcularNovoSalario();
            double percentual = funcionario.getPercentualAumento();

            System.out.printf("Novo salario R$ %.2f%n", novoSalario);
            System.out.printf("Aumento R$ %.2f%n", aumento);
            System.out.printf("Porcentagem = %.0f%%%n", percentual);

            entrada.close();
        }
    }
