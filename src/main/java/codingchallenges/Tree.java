package codingchallenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Tree<T> {

    Node<T> root;

    public Node<T> addRoot(T item) {
        root = new Node<>(item);
        return root;
    }

    public Node<T> add(Node<T> parent, T item) {
        Node<T> childNode = new Node<>(parent, item);
        parent.children.add(childNode);
        return childNode;
    }

    public void traverse() {
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            var cNode = stack.pop();
            System.out.println(cNode.item);
            cNode.children.forEach(child -> stack.push((Node)child));
        }
    }

    public static class Node<T> {
        T item;
        Node<T> prev;
        List<Node> children = new ArrayList<>();

        public Node(T item) {
            this.item = item;
        }

        public Node(Node<T> prev, T item) {
            this.item = item;
            this.prev = prev;
        }
    }
}
