package home_tasks;

public class TreeSort {
    public static void main(String[] args) {
        Node tree = new Node(16);
        tree.put(8);
        tree.put(4);
        tree.put(64);
        tree.put(32);
        System.out.printf("Tree elements: %s%n", tree);
        System.out.printf("Element sum: %d%n", tree.sum());
    }
}

