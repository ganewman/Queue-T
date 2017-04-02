public class MyDeque<T>{// implements Deque<T>{

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
	while(look != null){
	    ret += look + " ";
	    look = look.getPrev();
	}
	return ret;
    }
    
    //methods
    public void addFirst(T x){
	if( _size == 0){
	    _first = new DLLNode(x,null,null);
	    _last = _first;}
	else{
	    _first.setNext(new DLLNode<T>(x,_first,null));
	    _first = _first.getNext();
	}
	_size += 1;
    }
 
    public void addLast(T x){
	if( _size == 0){
	    _first = new DLLNode(x,null,null);
	    _last = _first;}
	else{
	    _last.setPrev(new DLLNode<T>(x,null,_last));
	    _last = _last.getPrev();
	}
	_size += 1;
    }
    /*---------------------------------------
    public T removeFirst();
    public T removeLast();
    public T peekLast();
    public int size();

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
    }
} //end class
