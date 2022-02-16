package codingchallenges;

public class CustomLinkedList<T> {

    Node<T> head;

    public CustomLinkedList() {
    }

    public void add(T data) {
        Node<T> lastNode = getLastNode();
        if (lastNode == null) {
            head = new Node<>(data);
        } else {
            lastNode.add(data);
        }
    }

    public Node<T> getLastNode() {
        if (isEmpty()) {
            return null;
        }
        Node<T> currentNode = head;
        Node<T> nextNode = currentNode.next;
        while (nextNode != null) {
            currentNode = nextNode;
            nextNode = currentNode.next;
        }
        return currentNode;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printAll() {
        Node<T> currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }

        public void add(T data) {
            this.next = new Node<>(data);
        }
    }
}
