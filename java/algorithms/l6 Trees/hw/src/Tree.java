import java.util.function.Consumer;

public interface Tree<E extends Comparable<? super E>> {
    enum TraverseMode {
        IN_ORDER,
        PRE_ORDER,
        POST_ORDER
    }
    boolean add(E val);
    boolean contains(E val);
    boolean remove(E val);
    boolean isEmpty();
    int size();
    void traverse(TraverseMode mode, Consumer<E> consumer);
    void display();
}
