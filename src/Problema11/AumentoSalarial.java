package Problema11;

public class AumentoSalarial {
        private double salarioAtual;

        public AumentoSalarial(double salarioAtual) {
            this.salarioAtual = salarioAtual;
        }

        public double getPercentualAumento() {
            if (salarioAtual <= 1000.00) {
                return 20.0;
            } else if (salarioAtual <= 3000.00) {
                return 15.0;
            } else if (salarioAtual <= 8000.00) {
                return 10.0;
            } else {
                return 5.0;
            }
        }

        public double calcularAumento() {
            return salarioAtual * getPercentualAumento() / 100.0;
        }

        public double calcularNovoSalario() {
            return salarioAtual + calcularAumento();
        }
    }

