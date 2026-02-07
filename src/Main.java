

import java.io.BufferedReader;
import java.io.IOException;

public class Main {
/**
 * Clase principal del programa.
 * Lee expresiones postfix desde un archivo de texto y muestra
 * el resultado de su evaluación.
 */

    public static void main(String[] args) {

        Stack<Integer> pila = new VectorStack<>();
        CalculadoraPostfix calculadora = new CalculadoraPostfix(pila);

        BufferedReader br = null;

        try {

            br = new BufferedReader(new java.io.InputStreamReader(Main.class.getResourceAsStream("datos.txt") ));

            String linea;

            while ((linea = br.readLine()) != null) {

                linea = linea.trim();

                if (!linea.isEmpty()) {

                    try {
                        int resultado = calculadora.evaluar(linea);
                        System.out.println("Resultado: " + resultado);

                    } catch (Exception e) {
                        System.out.println("Error en la expresion: " + e.getMessage());
                    }
                }
            }

        } catch (IOException e) {

            System.out.println("Error al leer el archivo datos.txt");

        } finally {

            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar archivo");
            }
        }
    }
}