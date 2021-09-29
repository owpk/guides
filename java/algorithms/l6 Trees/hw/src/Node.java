public class Node<T extends Comparable<? super T>> {
    private final T val;

    private Node<T> leftChild;
    private Node<T> rightChild;

    public Node(T val) {
        this.val = val;
    }

    public boolean isLeaf() {
        return leftChild == null && rightChild == null;
    }

    public T getVal() {
        return val;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return val.toString();
    }

    public void addChild(Node<T> newNode) {
        if (isRightChild(newNode.val)) {
            rightChild = newNode;
        } else leftChild = newNode;
    }

    public boolean isRightChild(T val) {
        return val.compareTo(this.val) > 0;
    }

    public boolean hasOnlyOneChild() {
        return leftChild == null ^ rightChild == null;
    }
}
