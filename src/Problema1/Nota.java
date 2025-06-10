package Problema1;

public class Nota {

        private double nota1;
        private double nota2;

        public Nota(double nota1, double nota2) {
            this.nota1 = nota1;
            this.nota2 = nota2;
        }

        public double calcularNotaFinal() {
            return nota1 + nota2;
        }

        public boolean estaReprovado() {
            return calcularNotaFinal() < 60.0;
        }
    }

