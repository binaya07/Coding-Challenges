import codingchallenges.CustomLinkedList;
import codingchallenges.Tree;

public class Main {

    public static void main(String[] args) {
//        Fibonacci.fibonacci();
//        StringManipulation.stringManipulation();
//        Prime.checkPrime();
//        Regex.regex();

//        customLinkedListEx();
        customTreeEx();
    }

    public static void customLinkedListEx() {
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(0);
        linkedList.printAll();
    }

    public static void customTreeEx() {
        Tree<Integer> tree = new Tree<>();
        var root = tree.addRoot(100);
        var child1 = tree.add(root, 49);
        var child2 = tree.add(root, 51);

        var child3 = tree.add(child1, 20);
        var child4 = tree.add(child1, 29);

        var child5 = tree.add(child2, 21);
        var child6 = tree.add(child2, 30);

        tree.traverse();
    }

}
