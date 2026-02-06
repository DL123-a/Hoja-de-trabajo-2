import java.util.Vector;

public class VectorStack<T> implements Stack<T> {
    private Vector<T> data;


    public VectorStack(){
        data = new Vector<>();
    }

    @Override
    public void push(T element){
        data.add(element);
    }

    @Override
    public T pop(){
        return data.remove(data.size()-1);
    }

    @Override
    public T peek(){
        return data.get(data.size()-1);
    }

    @Override
    public int size() {
        return data.size();
    }   
}
