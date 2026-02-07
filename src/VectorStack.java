package src;
import java.util.Vector;
/**
 * Implementación de la interfaz Stack utilizando un Vector
 * como estructura interna de almacenamiento.
 *
 * @param <T> tipo de elementos almacenados en la pila
 */

public class VectorStack<T> implements Stack<T> {
    private Vector<T> data;

    /**
     * Constructor de la pila.
     *
     * @post la pila se inicializa vacía
     */


    public VectorStack(){
        data = new Vector<>();
    }

    /**
     * Inserta un elemento en la pila.
     *
     * @param element elemento a insertar
     * @pre element != null
     * @post el elemento queda en la cima de la pila
     */

    @Override
    public void push(T element){
        data.add(element);
    }

      /**
     * Elimina y devuelve el elemento en la cima de la pila.
     *
     * @return elemento removido
     * @pre la pila no debe estar vacía
     * @post el tamaño de la pila disminuye en uno
     */

    @Override
    public T pop(){
        return data.remove(data.size()-1);
    }

    /**
     * Devuelve el elemento en la cima de la pila sin eliminarlo.
     *
     * @return elemento en la cima
     * @pre la pila no debe estar vacía
     * @post la pila no se modifica
     */

    @Override
    public T peek(){
        return data.get(data.size()-1);
    }

     /**
     * Devuelve la cantidad de elementos en la pila.
     *
     * @return número de elementos almacenados
     * @post la pila no se modifica
     */

    @Override
    public int size() {
        return data.size();
    }   
}
