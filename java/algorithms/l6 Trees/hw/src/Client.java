public class Client {
    public static void main(String[] args) {
        TreeImpl<Integer> tree = new TreeImpl<>();
        tree.add(0);
        tree.add(1);
        tree.add(2);
        tree.traverse(Tree.TraverseMode.IN_ORDER, System.out::print);
    }
}
