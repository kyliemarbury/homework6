public class LinkedStack<T> implements Stack<T> {
    LinkedNode<T> head;
    int size = 0;
    
    public void push(T newItem) {  //O(1), and this is good
        LinkedNode<T> newNode = new LinkedNode<T>(newItem);
        if (head == null){
            head = newNode;
            size = 1;
        }
        else{
            newNode.setNext(head);
            head = newNode;
            size++;
        }
    }

    public T pop() {   //O(1), still good
        if (head == null){
            return null;
        }
        else if (head.getNext() == null){
            size = 0;
            T targetElement = head.getElement();
            head = null;
            return targetElement;
        }
        else{
            size--;
            T targetElement = head.getElement();
            head = head.getNext();
            return targetElement;
        }
    }

    public T peek() { //O(1)
        if (head == null){
            return null;
        }
        else if (head.getNext() == null){
            T targetElement = head.getElement();
            return targetElement;
        }
        else{
            T targetElement = head.getElement();
            return targetElement;
        }
    }

    public boolean empty() {  //O(1)
        return head == null;
    }

    public int size() {  //O(1)!!!!
        return size;
    }
    
}
