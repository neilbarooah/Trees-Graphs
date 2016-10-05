/**
 * Created by neilbarooah on 17/09/16.
 */
public class Node<T> {

    public T data;
    public Node<T> previous;
    public Node<T> next;

    /**
     * Creates a new LinkedListNode with the given T object and node references.
     *
     * @param data The data stored in the new node.
     * @param previous The previous node in the list.
     * @param next The next node in the list.
     */
    public Node(T data, Node<T> previous,
                Node<T> next) {
        this.data = data;
        this.previous = previous;
        this.next = next;
    }

    /**
     * Creates a new LinkedListNode with only the given T object.
     *
     * @param data The data stored in the new node.
     */
    public Node(T data) {
        this(data, null, null);
    }

    /**
     * Gets the data stored in the node.
     *
     * @return The data in this node.
     */
    public T getData() {
        return data;
    }

    /**
     * Gets the next node.
     *
     * @return The next node.
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * Set the next node.
     *
     * @param next The new next node.
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }

    /**
     * Gets the previous node.
     *
     * @return The previous node.
     */
    public Node<T> getPrevious() {
        return previous;
    }

    /**
     * Set the previous node.
     *
     * @param previous The new previous node.
     */
    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "Node containing: " + data;
    }
}
