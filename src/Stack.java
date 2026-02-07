/**
 * ADT Pila genérica.
 * Define las operaciones básicas de una pila bajo el principio LIFO
 * (Last In, First Out).
 *
 * @param <T> tipo de elementos almacenados en la pila
 */

package src;
public interface Stack<T>{
    /**
     * Inserta un elemento en la cima de la pila.
     *
     * @param element elemento a insertar
     * @pre element != null
     * @post el elemento queda en la cima de la pila
     */
    void push(T element);
   
 /**
     * Elimina y devuelve el elemento en la cima de la pila.
     *
     * @return elemento removido de la pila
     * @pre la pila no debe estar vacía
     * @post el tamaño de la pila disminuye en uno
     */

    T pop();

     /**
     * Devuelve el elemento en la cima de la pila sin eliminarlo.
     *
     * @return elemento en la cima de la pila
     * @pre la pila no debe estar vacía
     * @post la pila no se modifica
     */

    T peek();

      /**
     * Devuelve la cantidad de elementos en la pila.
     *
     * @return número de elementos almacenados
     * @post la pila no se modifica
     */

    int size();
}