package Node;

import person.Person;

public class Node {
    private Person value;
    private contactList.Node next;

    public Node(Person value) {
        this.value = value;
    }

    public Person getValue() {
        return value;
    }

    public void setValue(Person value) {
        this.value = value;
    }

    public contactList.Node getNext() {
        return next;
    }

    public void setNext(contactList.Node next) {
        this.next = next;
    }
}

