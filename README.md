# Queue-T
## Noah Tang, Henry Zheng, Gabrielle Newman
## APCS pd 3, Lab02

## Deque Interface
The Deque interface specifies methods required for a double-ended Queue and extends the Queue interface provided by the AP. Our state of the art enterprise Deque technology utilizes the following methods:

### Methods for compliance with Queue
#### public T dequeue()
Dequeues and returns the first element of the queue.
#### public void enqueue(T x)
Enqueue an element onto the back of this queue.
#### public boolean isEmpty()
Returns whether the deque is empty
#### public T peekFront()
Returns first element of Queue without DQing it.

### Additional Deque interface methods
#### public void addFirst(T x)
Adds an element to the front of the Deque
#### public void addLast(T x)
Adds an element to the end of the Deque
#### public T peekLast()
Returns an element from the end of the Deque without removing it
#### public T removeFirst()
Returns and removes an element from the front of the Deque
#### public T removeLast()
Returns and removes an element from the end of the Deque
#### public int size()
Returns the number of elements in the Deque
#### public boolean contains(Object O)
Returns whether the Deque contains the given object

