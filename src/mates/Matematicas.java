package mates;

import java.util.Random;

/**
 * La clase Matematicas proporciona métodos para cálculos matemáticos.
 */

public class Matematicas {

    /**
     * Genera una aproximación al número pi mediante el método de Montecarlo.
     * El parámetro `pasos` indica el número de puntos generados.
     *
     * @param pasos El número de puntos generados.
     * @return Una aproximación del valor de pi.
     */
    public static double generarNumeroPiIterativo(long pasos) {
        long dentroCirculo = 0;
        Random random = new Random();

        for (long i = 0; i < pasos; i++) {
            double x = random.nextDouble(); // Genera coordenada x aleatoria entre 0 y 1
            double y = random.nextDouble(); // Genera coordenada y aleatoria entre 0 y 1

            // Calcula la distancia desde el punto (x, y) al origen (0, 0)
            double distanciaAlOrigen = Math.sqrt(x * x + y * y);

            // Verifica si el punto está dentro del círculo unitario de radio 1
            if (distanciaAlOrigen <= 1) {
                dentroCirculo++;
            }
        }

        /** La probabilidad de un punto de estar dentro del círculo es igual al área del círculo dividido por el área del cuadrado
        / Como el área del círculo es pi * r^2 y el radio es 1, el área del círculo es pi.
        / El área del cuadrado es 1 * 1 = 1.
        / Por lo tanto, la probabilidad de un punto de estar dentro del círculo es pi / 4.
         */
        double probabilidadDentroCirculo = (double) dentroCirculo / pasos;

        // Pi es igual a 4 veces la probabilidad de un punto de estar dentro del círculo.
        return 4 * probabilidadDentroCirculo;
    }
}

