package aplicacion;

import mates.Matematicas;
/**
 * La clase Principal es la clase principal de la aplicación.
 * Calcula una aproximación del número PI utilizando la clase Matematicas.
 */
public class Principal{

    /**
     * El método main es el punto de entrada principal de la aplicación.
     * Calcula una aproximación de PI utilizando el método generarNumeroPiIterativo de la clase Matematicas.
     *
     * @param args Los argumentos de la línea de comandos. El primer argumento va a ser el número de pasos para la aproximación.
     */
    public static void main(String[] args){
        System.out.println("El número PI es " +
                Matematicas.generarNumeroPiIterativo(Integer.parseInt(args[0])));
    }
}