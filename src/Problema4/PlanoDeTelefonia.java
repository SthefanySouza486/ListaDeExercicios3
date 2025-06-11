package Problema4;

public class PlanoDeTelefonia {
        private final int minutosConsumidos;
        private final double valorBase = 50.00;
        private final int franquia = 100;
        private final double valorMinutoExcedente = 2.00;


        public PlanoDeTelefonia(int minutosConsumidos) {
            this.minutosConsumidos = minutosConsumidos;
        }

        public double calcularValorAPagar() {
            if (minutosConsumidos <= franquia) {
                return valorBase;
            } else {
                int minutosExcedentes = minutosConsumidos - franquia;
                return valorBase + minutosExcedentes * valorMinutoExcedente;
            }
        }
    }
