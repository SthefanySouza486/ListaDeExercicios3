package Problema9;

public class Lanchonete {
        public static double calcularTotal(int codigo, int quantidade) {
            double preco;

            switch (codigo) {
                case 1:
                    preco = 5.00;
                    break;
                case 2:
                    preco = 3.50;
                    break;
                case 3:
                    preco = 4.80;
                    break;
                case 4:
                    preco = 8.90;
                    break;
                case 5:
                    preco = 7.32;
                    break;
                default:
                    throw new IllegalArgumentException("Código de produto inválido.");
            }

            return preco * quantidade;
        }
    }
