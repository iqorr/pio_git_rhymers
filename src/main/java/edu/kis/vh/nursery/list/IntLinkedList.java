package edu.kis.vh.nursery.list;

/**
 * This class implements a singly linked list for integer values. It provides methods to manipulate the list
 * by adding and removing elements at the end, similar to stack behavior.
 */
public class IntLinkedList {

    private static final int EMPTY = -1; // Constant representing that the list or stack is empty.

    private Node last; // The last node in the linked list.
    private int i; // TODO: This variable 'i' seems unused and should be removed if it is not necessary.


    /**
     * Adds a new integer to the end of the list.
     * If the list is empty, the new element becomes the last element.
     *
     * @param i the integer value to be added to the list.
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Checks whether the list is empty.
     *
     * @return true if the list has no elements, false otherwise.
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Checks whether the list is full.
     * In the current implementation, the list never reaches full capacity.
     *
     * @return always returns false, indicating the list is never full.
     */
    public boolean isFull() {
        return false; // TODO: Review if having an isFull method is necessary as it always returns false.
    }

    /**
     * Returns the integer value of the last item in the list without removing it.
     * If the list is empty, the method returns a predefined empty value.
     *
     * @return the integer value at the end of the list or EMPTY if the list is empty.
     */
    public int top() {
        if (isEmpty())
            return EMPTY;
        return last.getValue();
    }

    /**
     * Removes and returns the integer value of the last item in the list.
     * If the list is empty, the method returns a predefined empty value.
     *
     * @return the last integer value or EMPTY if the list is empty.
     */
    public int pop() {
        if (isEmpty())
            return EMPTY;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    /**
     * Private inner class representing a node in the linked list.
     * Each node stores an integer value and references to the next and previous nodes in the list.
     */
    private class Node {
        private int value; // The integer value this node holds.
        private Node prev; // Reference to the previous node in the list.
        private Node next; // Reference to the next node in the list.

        /**
         * Constructs a new node with the specified integer value.
         *
         * @param i the integer value to store in this node.
         */
        Node(int i) {
            value = i;
        }

        /**
         * Gets the integer value stored in this node.
         *
         * @return the integer value of this node.
         */
        int getValue() {
            return value;
        }

        /**
         * Gets the previous node in the list.
         *
         * @return the previous node, or null if this is the first node.
         */
        Node getPrev() {
            return prev;
        }

        /**
         * Sets the previous node in the list to the given node.
         *
         * @param prev the node that should precede this node.
         */
        void setPrev(Node prev) {
            this.prev = prev;
        }

        /**
         * Gets the next node in the list.
         *
         * @return the next node, or null if this is the last node.
         */
        Node getNext() {
            return next;
        }

        /**
         * Sets the next node in the list to the given node.
         *
         * @param next the node that should follow this node.
         */
        void setNext(Node next) {
            this.next = next;
        }
    }
}
