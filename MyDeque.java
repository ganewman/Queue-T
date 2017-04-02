public class MyDeque implements Deque{

    //Instance vars
    private int _size;
    private DLLNode _first;
    private DLLNode _last;

    //methods
    public void addFirst(T x);
    public void addLast(T x);
    public T removeFirst();
    public T removeLast();
    public T peekLast();
    public int size();

    //Queue compliance methods
    public T dequeue();
    public void enqueue( T x );
    public boolean isEmpty();
    public T peekFront();

} //end class
