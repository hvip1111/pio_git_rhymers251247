package edu.kis.vh.nursery.list;

/**
 * Klasa tworząca Node czyli węzęł dla listy dwukierunkowej
 */
public class Node {

    private final int value;
    private Node prev;
    private Node next;

    /**
     * konstruktor, tworzy nowy węzeł
     * @param i wartość w węźle
     */
    public Node(int i) {
        value = i;
    }

    /**
     * zwraca wartość jaka znajduje się w węźle
     * @return wartość w węźle
     */
    public int getValue() {
        return value;
    }

    /**
     * zwraca poprzedni węzeł w liście
     * @return poprzedni węzeł listy
     */
    public Node getPrev() {
        return prev;
    }

    /**
     * Zapisuje nowa wartość w poprzednim węźle
     * @param prev nowa wartość węzła poprzedniego
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    /**
     * zwraca nastepny węzeł w liście
     * @return nestepny węzeł listy
     */
    public Node getNext() {
        return next;
    }

    /**
     * Zapisuje nowa wartość w nastepnym węźle
     * @param next nowa wartość węzła nastepnego
     */
    public void setNext(Node next) {
        this.next = next;
    }
}
