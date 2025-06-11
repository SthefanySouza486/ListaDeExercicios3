package Problema6;

public class MedidorGlicose {
        private final double nivelGlicose;

        public MedidorGlicose(double nivelGlicose) {
            this.nivelGlicose = nivelGlicose;
        }

        public String classificar() {
            if (nivelGlicose <= 100.0) {
                return "normal";
            } else if (nivelGlicose <= 140.0) {
                return "elevado";
            } else {
                return "diabetes";
            }
        }
    }
