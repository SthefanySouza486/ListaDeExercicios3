package Problema7;

public class LancamentoDeDardo {
        private double tentativa1;
        private double tentativa2;
        private double tentativa3;

        public LancamentoDeDardo(double tentativa1, double tentativa2, double tentativa3) {
            this.tentativa1 = tentativa1;
            this.tentativa2 = tentativa2;
            this.tentativa3 = tentativa3;
        }

        public double maiorDistancia() {
            return Math.max(tentativa1, Math.max(tentativa2, tentativa3));
        }
    }

