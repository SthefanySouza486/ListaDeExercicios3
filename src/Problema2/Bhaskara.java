package Problema2;

public class Bhaskara {
        private double a;
        private double b;
        private double c;

        public Bhaskara(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double calcularDelta() {
            return b * b - 4 * a * c;
        }

        public boolean temRaizesReais() {
            return calcularDelta() >= 0;
        }

        public double calcularX1() {
            return (-b + Math.sqrt(calcularDelta())) / (2 * a);
        }

        public double calcularX2() {
            return (-b - Math.sqrt(calcularDelta())) / (2 * a);
        }
    }

