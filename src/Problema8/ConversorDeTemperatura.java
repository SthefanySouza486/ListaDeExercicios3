package Problema8;

public class ConversorDeTemperatura {
        public static double fahrenheitParaCelsius(double f) {
            return (5.0 / 9.0) * (f - 32.0);
        }

        public static double celsiusParaFahrenheit(double c) {
            return (c * 9.0 / 5.0) + 32.0;
        }
    }

