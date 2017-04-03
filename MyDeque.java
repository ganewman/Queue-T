public class MyDeque<T> implements Deque<T>{

    /*==================Illustration=======================

      _first                                     _last
      |____          ____          ____          ____|
      [    ]--prev->[    ]--prev->[    ]--prev->[    ]
      [____]<-next--[____]<-next--[____]<-next--[____]

      ===================================================*/


    //Instance vars
    private int _size;
    private DLLNode _first;
    private DLLNode _last;

    //constructor
    public MyDeque(){
	_size = 0;
	_first = null;
	_last = null;
    }

    //toString
    public String toString(){
	String ret = "";
	DLLNode look = _first;
	while(look != null){ // iterate through deque until you read the end (pointer to null);
	    ret += look + " "; // add each node to retString 
	    look = look.getPrev(); // increment current place in deque
	}
	return ret;
    }
    
    //methods
    public void addFirst(T x){
	if( _size == 0){ // if deque has no nodes yet
	    _first = new DLLNode(x,null,null); // the node being added will be the first and last node
	    _last = _first; 
	}
	else { // if deque already has size > 0
	    _first.setNext(new DLLNode<T>(x,_first,null)); // add a new node before the current first node
	    _first = _first.getNext(); // the node just added is now the first node
	}
	_size += 1; // increment deque size by 1
    }
 
    public void addLast(T x){
	if( _size == 0){ // if deque has no nodes yet
	    _first = new DLLNode(x,null,null); // the node being added will be the first and last node
	    _last = _first;}
	else{ // if deque already has size > 0
	    _last.setPrev(new DLLNode<T>(x,null,_last)); // add the new node after the current last node
	    _last = _last.getPrev(); // the node just added is now the last node
	}
	_size += 1; // increment deque size by one
    }

    //remove methods assume queue ! empty
    public T removeFirst(){
	DLLNode<T> temp = _first; // store node being removed
	_first = _first.getPrev(); // set first equal to the current second node
	_first.setNext(null); // set its next node to null
	_size -= 1; // decrement size by one
	return temp.getCargo(); 
    }

    public T removeLast(){
	DLLNode<T> temp = _last; // store node being removed
	_last = _last.getNext(); // set last node equal to current penultimate node
	_last.setPrev(null); // set its previous node to null
	_size -= 1; // decrement size by one
	return temp.getCargo();
    }

    public T peekLast(){
	DLLNode<T> temp = _last; // store last node
	return temp.getCargo(); // return its cargo
    }

    public int size(){
	return _size;
    }

    //Queue compliance methods

    //assume queue ! empty
    public T dequeue(){
	return removeFirst();
    }

    public void enqueue( T x ){
	addLast(x);
    }

    public boolean isEmpty(){
	return _size == 0;
    }

    public T peekFront(){
	DLLNode<T> temp = _first; // store first node
	return temp.getCargo(); // return its cargo
    }

    public boolean contains(Object o){
	boolean retBool = false; // return false unless target is found
	DLLNode temp = _last;
	while (temp != null){ // iterate to the end of the deque
	    if (temp.getCargo().equals(o)){ // check cargo of each node against the target
		retBool = true; // if a match is found, target is present in the deque; return true
	    }
	    temp = temp.getNext(); // increment by moving over one node in the deque
	}
	return retBool;
    }

    /*---------------------------------------
    public T removeFirst();
    public T removeLast();
    public T peekLast();
    public int size();
    public boolean contains(Object o);

    //Queue compliance methods
    public T dequeue();
    public void enqueue( T x );
    public boolean isEmpty();
    public T peekFront();
    -----------------------------------*/
    public static void main(String[] args){
	MyDeque<String> Bar = new MyDeque<String>();
	Bar.addFirst("hello");
	System.out.println(Bar);
	Bar.addFirst("there");	
	System.out.println(Bar);
	Bar.addFirst("bear");
	System.out.println(Bar);
	Bar.addLast("atTheEnd");
	System.out.println(Bar);
	Bar.removeFirst();
	System.out.println(Bar);
	Bar.removeLast();
	System.out.println(Bar);
	System.out.println(Bar.peekLast());
	System.out.println(Bar.size());
	System.out.println(Bar);
        Bar.dequeue();
	System.out.println(Bar);
	Bar.enqueue("there");
	System.out.println(Bar);
	MyDeque<String> empty = new MyDeque<String>();
	System.out.println(Bar.isEmpty());
	System.out.println(empty.isEmpty());
	System.out.println(Bar);
	System.out.println(Bar.contains("there")); // should return true
	System.out.println(Bar.contains("hi")); // should return false
    }
} //end class
