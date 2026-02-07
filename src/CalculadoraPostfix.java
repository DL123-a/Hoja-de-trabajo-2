/**
 * ADT Calculadora para evaluar expresiones en notación postfix.
 * Utiliza una pila genérica para realizar las operaciones.
 */


package src;
public class CalculadoraPostfix {

    private Stack<Integer> stack;
    /**
     * Constructor de la calculadora.
     *
     * @param stack pila que será utilizada para evaluar la expresión
     * @pre stack != null
     * @post la calculadora queda lista para evaluar expresiones postfix
     */

    public CalculadoraPostfix(Stack<Integer> stack) {
        this.stack = stack;
    /**
     * Evalúa una expresión en notación postfix.
     *
     * @param expresion cadena con la expresión postfix separada por espacios
     * @return resultado entero de la expresión
     * @pre la expresión debe estar en notación postfix válida
     * @post se devuelve el resultado final de la evaluación
     */
    }

    public int evaluar(String expresion) {

        while(stack.size() > 0){
            stack.pop();
        }

        String[] tokens = expresion.trim().split(" ");

        for (String token : tokens) {

            if(token.isEmpty()){
                continue;
            }

            if (Character.isDigit(token.charAt(0))) {

                int numero = Integer.parseInt(token);
                stack.push(numero);

            } else {

                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Expresion postfix invalida: faltan operandos");
                }

                int b = stack.pop();
                int a = stack.pop();
                int resultado;

                if (token.equals("+")) {
                    resultado = a + b;
                } else if (token.equals("-")) {
                    resultado = a - b;
                } else if (token.equals("*")) {
                    resultado = a * b;
                } else if (token.equals("/")) {

                    if (b == 0) {
                        throw new ArithmeticException("Division entre cero");
                    }

                    resultado = a / b;

                } else {
                    throw new IllegalArgumentException("Operador invalido: " + token);
                }

                stack.push(resultado);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Expresion postfix invalida");
        }

        return stack.pop();
    }
}