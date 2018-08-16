package home_tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Node {
    private Node root = null;
    private Node left;
    private int val;
    private Node right;

    public Node(int n) {
        this.left = null;
        this.val = n;
        this.right = null;

        // check whether we have root or not
        if (root == null) {
            root = this;
        }
    }

    public void put(int i) {
        List<Node> nodeList = getNodeList(root);
        Node newNode = new Node(i);

        Node prev = null;

        /// todo
        for (Node node : nodeList) {
            if (node.val > i) {
                node.left = newNode;
            } else {
                node.right = newNode;
            }
        }
    }

    private List<Node> getNodeList(Node node) {
        List<Node> nodeList = new ArrayList<>();

        if (node != null) {
            nodeList.add(node);
            nodeList.addAll(getNodeList(node.left));
            nodeList.addAll(getNodeList(node.right));
        }

        return nodeList;
    }

    public String toString() {
        List<Node> nodeList = getNodeList(root);
        List<Integer> numbers = new ArrayList<>();
        for (Node node : nodeList) {
            numbers.add(node.val);
        }

        Collections.sort(numbers);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numbers.size() - 1; i ++) {
            result.append(numbers.get(i)).append(" > ");
        }

        return result.toString() + numbers.get(numbers.size() - 1);
    }

    public int sum() {
        int sum = 0;
        List<Node> nodeList = getNodeList(root);
        for (Node node : nodeList) {
            sum += node.val;
        }
        return sum;
    }
}
