package prog.kiev.ua.homework.Module8.Queue;

/**
 * Created by igorsinchuk on 8/25/17.
 */
public interface Queue<E> extends Iterable<E> {

    void offer(E e);
    E remove();
    E poll();
    E element();
    E peek();
    int size();
    boolean isEmpty();
    boolean contains(E elem);
}
