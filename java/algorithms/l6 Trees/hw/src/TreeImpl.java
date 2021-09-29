import java.util.function.Consumer;

public class TreeImpl<E extends Comparable<? super E>> implements Tree<E> {
    private Node<E> root;
    private int size;

    @Override
    public boolean add(E val) {
        Node<E> newNode = new Node<>(val);
        if (isEmpty()) {
            root = newNode;
            size++;
            return true;
        }
        if (contains(val)) return false;
        NodeAndParent nodeAndParent = doFind(val);
        Node<E> prev = nodeAndParent.parent;
        prev.addChild(newNode);
        size++;
        return true;
    }

    private NodeAndParent doFind(E val) {
        Node<E> curr = root;
        Node<E> prev = null;

        while (curr != null) {
            if (curr.getVal().equals(val))
                return new NodeAndParent(null, curr);
            prev = curr;
            if (curr.isRightChild(val)) {
                curr = curr.getRightChild();
            } else curr = curr.getLeftChild();
        }
        return new NodeAndParent(prev, null);
    }

    @Override
    public boolean contains(E val) {
        return doFind(val).current != null;
    }

    @Override
    public boolean remove(E val) {
        NodeAndParent nodeAndParent = doFind(val);
        Node<E> cur = nodeAndParent.current;
        Node<E> par = nodeAndParent.parent;
        if (cur == null) return false;
        if (cur.isLeaf()) {
            if (cur == root) {
                root = null;
            } else if (par.isRightChild(val))
                par.setRightChild(null);
            else par.setLeftChild(null);
        }
        else if (cur.hasOnlyOneChild()) {
            Node<E> nextNode = cur.getLeftChild() != null ? cur.getLeftChild() : cur.getRightChild();
            if (cur == root) {
                root = nextNode;
            } else if (par.isRightChild(val)) {
                par.setRightChild(nextNode);
            } else par.setLeftChild(nextNode);
        }
        else {
            Node<E> successor = getSuccessor(cur);
            if (cur == root) {
                root = successor;
            } else if (par.isRightChild(val)) {
                par.setRightChild(successor);
            } else par.setLeftChild(successor);
            successor.setLeftChild(cur.getLeftChild());
        }
        size--;
        return false;
    }

    private Node<E> getSuccessor(Node<E> cur) {
        Node<E> successor = cur;
        Node<E> successorPar = null;
        Node<E> temp = cur.getRightChild();
        while (temp != null) {
            successorPar = successor;
            successor = temp;
            temp = temp.getLeftChild();
        }
        if (successor != cur.getRightChild() && successorPar != null) {
            successorPar.setLeftChild(successor.getRightChild());
            successor.setRightChild(cur.getRightChild());
        }
        return successor;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void traverse(TraverseMode mode, Consumer<E> consumer) {
        switch (mode) {
            case IN_ORDER -> inOrder(root, consumer);
            case PRE_ORDER -> preOrder(root, consumer);
            case POST_ORDER -> postOrder(root, consumer);
            default -> throw new IllegalArgumentException("Unknown mode: " + mode);
        }
    }

    @Override
    public void display() {

    }

    private void postOrder(Node<E> curr, Consumer<E> eConsumer) {
        if (curr == null) return;
        postOrder(curr.getLeftChild(), eConsumer);
        postOrder(curr.getRightChild(), eConsumer);
        eConsumer.accept(curr.getVal());
    }

    private void preOrder(Node<E> curr, Consumer<E> eConsumer) {
        if (curr == null) return;
        eConsumer.accept(curr.getVal());
        preOrder(curr.getLeftChild(), eConsumer);
        preOrder(curr.getRightChild(), eConsumer);
    }

    private void inOrder(Node<E> curr, Consumer<E> eConsumer) {
        if (curr == null) return;
        inOrder(curr.getLeftChild(), eConsumer);
        eConsumer.accept(curr.getVal());
        inOrder(curr.getRightChild(), eConsumer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> curr = root;
        while (curr != null) {
            curr = curr.getLeftChild();

        }
        return sb.toString();
    }

    private class NodeAndParent {
        Node<E> parent;
        Node<E> current;

        public NodeAndParent(Node<E> parent, Node<E> current) {
            this.parent = parent;
            this.current = current;
        }
    }
}
