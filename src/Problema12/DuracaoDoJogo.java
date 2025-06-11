package Problema12;

public class DuracaoDoJogo {
        private final int horaInicial;
        private final int horaFinal;

        public DuracaoDoJogo(int horaInicial, int horaFinal) {
            this.horaInicial = horaInicial;
            this.horaFinal = horaFinal;
        }

        public int calcularDuracao() {
            if (horaInicial == horaFinal) {
                return 24;
            } else if (horaInicial < horaFinal) {
                return horaFinal - horaInicial;
            } else {
                return 24 - horaInicial + horaFinal;
            }
        }
    }
