package Problema10;

public class Multiplos {
        private int a;
        private int b;

        public Multiplos(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public boolean saoMultiplos() {
            return (a % b == 0) || (b % a == 0);
        }
    }
