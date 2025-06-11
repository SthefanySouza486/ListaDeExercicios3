package Problema5;

public class TrocoOuFalta {
        private final double precoUnitario;
        private final int quantidade;
        private final double dinheiroRecebido;

        public TrocoOuFalta(double precoUnitario, int quantidade, double dinheiroRecebido) {
            this.precoUnitario = precoUnitario;
            this.quantidade = quantidade;
            this.dinheiroRecebido = dinheiroRecebido;
        }

        public void calcularResultado() {
            double total = precoUnitario * quantidade;

            if (dinheiroRecebido >= total) {
                double troco = dinheiroRecebido - total;
                System.out.printf("TROCO = %.2f\n", troco);
            } else {
                double falta = total - dinheiroRecebido;
                System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS\n", falta);
            }
        }
    }
