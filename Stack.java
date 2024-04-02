public interface Stack<T>{
    public void push(T newItem);

    public T pop();

    public T peek();

    public boolean empty();

    public int size();
}