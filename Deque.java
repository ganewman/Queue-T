public interface Deque<T> extends Queue<T> {

    //~~~~~~~~~~~~~~~~~~begin Queue interface subset~~~~~~~~~~~~~~~~~~
    //means of removing an element from collection:
    //Dequeues and returns the first element of the queue.
    public T dequeue();

    //means of adding an element to collection:
    //Enqueue an element onto the back of this queue.
    public void enqueue( T x );

    //Returns true if this queue is empty, otherwise returns false.
    public boolean isEmpty();

    //Returns the first element of the queue without dequeuing it.
    public T peekFront();
    //~~~~~~~~~~~~~~~~~~~end Queue interface subset~~~~~~~~~~~~~~~~~~~

    public void addFirst(T x);
    
    public void addLast(T x);

    public T peekLast();

    public T removeFirst();

    public T removeLast();

    public int size();

    /* Methods to possibly add later
       


     */

}
