package Problema5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

                System.out.print("Preço unitário do produto: ");
                double preco = entrada.nextDouble();

                System.out.print("Quantidade comprada: ");
                int quantidade = entrada.nextInt();

                System.out.print("Dinheiro recebido: ");
                double dinheiro = entrada.nextDouble();

                TrocoOuFalta venda = new TrocoOuFalta(preco, quantidade, dinheiro);
                venda.calcularResultado();

                entrada.close();
            }
        }
