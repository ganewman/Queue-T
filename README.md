# Queue-T
## Noah Tang, Henry Zheng, Gabrielle Newman
## APCS pd 3, Lab02

## Deque Interface
The Deque interface specifies methods required for a double-ended Queue and extends the Queue interface provided by the AP. Our state of the art enterprise Deque technology is explained below:


***
### Structure
***
We chose a doubly linked node based structure because we felt that it was most suited for an efficient implementation of deque and queue methods. 

First, a node-based structure has the convenient ability to be resized at will. In comparison, an array or arraylist requires infrequent expansion -- a costly operation in both time and memory. 

Furthermore, the nature of a Deque requires that adding and removing elements must be done on both ends of the underlying data-structure. In an array or AL-based Deque, adding or removing from at least one end (the 'front' or lower-index end) will always be a linear operation. This operation requires the shifting of all higher-index elements down by one index, or up by one index. A node-based structure requires no such work and can easily accomplish adding and removing from either end in constant time, making it the more efficient choice.

One great advantage of the Array or AL is its ability to fetch elements at any index in constant time. A node-based collection must traverse in linear time to find a given index. However, the Deque should only be accessible at the front and the end, not at any index. Pointers can be maintained on either end of the list with no further need to access the interior. Thus the advantage of using an Array or AL is diminished for this specific application.


***
### Methods for compliance with Queue
***
#### public T dequeue()
Dequeues and returns the first element of the queue.
#### public void enqueue(T x)
Enqueue an element onto the back of this queue.
#### public boolean isEmpty()
Returns whether the deque is empty
#### public T peekFront()
Returns first element of Queue without DQing it.


***
### Additional Deque interface methods
***
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


### Recent Changes
***
1. Removed unnecessary files - advised by QQ
2. Modified README and improved explanation of structure - advised by QQ

QQ's DequeTester appears to run without error, and the results are as expected.