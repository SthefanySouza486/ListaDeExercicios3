package Problema3;

public class MenorDeTres {
        private int a;
        private int b;
        private int c;

        public MenorDeTres(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public int menor() {
            int menor = a;
            if (b < menor) {
                menor = b;
            }
            if (c < menor) {
                menor = c;
            }

            return menor;
        }
    }

