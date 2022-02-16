import codingchallenges.CustomLinkedList;
import codingchallenges.Prime;
import codingchallenges.Regex;

import java.util.LinkedList;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
//        Fibonacci.fibonacci();
//        StringManipulation.stringManipulation();
//        Prime.checkPrime();
//        Regex.regex();

        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(0);
        linkedList.printAll();
    }

}
