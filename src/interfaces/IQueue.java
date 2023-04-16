package interfaces;

public interface IQueue<E> extends Iterable<E> {
    void enqueue(E element);

    E dequeue();

    E peek();

    int size();

    boolean isEmpty();
}


