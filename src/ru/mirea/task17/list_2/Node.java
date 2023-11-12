package ru.mirea.task17.list_2;

public class Node {
    Gem value;
    Node previous, next;
    public Node(Gem value, Node previous,  Node next) {
        this.value = value;
        this.previous = previous;
        this.next = next;
    }

    @Override
    public String toString() {
        String ret = "Node [\nValue: " + value + "\n";
        if (!(previous==null)) {
            ret = ret + "Previous: " + previous.value + "\n";

        } else {
            ret = ret + "Previous: None\n";
        }
        if (!(next==null)) {
            ret = ret + "Next: " + next.value + "\n";
        } else {
            ret = ret + "Next: None\n";
        }
        ret = ret + "]";
        return ret;
    }
}
