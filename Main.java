import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> pila = new VectorStack<>();
        CalculadoraPostfix calculadora = new CalculadoraPostfix(pila);

        try {
            BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
            String linea;

            while ((linea = br.readLine()) != null) {

                if (!linea.isEmpty()) {
                    int resultado = calculadora.evaluar(linea);
                    System.out.println("Resultado: " + resultado);
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        } catch (Exception e) {
            System.out.println("Error en la expresion: " + e.getMessage());
        }
    }
}