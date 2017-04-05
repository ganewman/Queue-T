/*
  Team QQ -- Rihui Zheng, YuQi Wu, Elaina Chung
  APCS2 pd3
  HW29 Stress is the Best
  2017-04-05
 */

public class DequeTester{

    public static void main(String[] args){
	// test case
	Deque<String> test = new MyDeque<String>();

	// test add()
	test.addLast("I");	
	test.addLast("am");	
	test.addLast("a");
	test.addLast("test");
	test.addLast("case");
	System.out.println(test + "\n"); // I am a test case

	// test addFirst
	test.addFirst("Hello,");
	System.out.println(test + "\n"); // Hello, I am a test case

	// test getFirst() and getLast()
	System.out.println("First: " + test.peekFront()); // Hello,
	System.out.println("Last: " + test.peekLast() + "\n"); // case
	
	// test remove()
	test.removeLast();
	System.out.println(test); // Hello, I am a test
	test.removeLast();
	System.out.println(test); // Hello, I am a
	test.removeLast();
	System.out.println(test + "\n"); // Hello, I am
 
	// test removeFirst()
	test.removeFirst();
	System.out.println(test + "\n"); // I am

	// test size()
	System.out.println(test.size()); // 2

	// test contains(Object o)	
	System.out.println(test.contains("I") );
	System.out.println(test.contains("am") );
	System.out.println(test.contains("Hello,") );
	
	/*
	// test clear()
	test.clear();
	System.out.println("\ntest: " + test);
	System.out.println("size: " + test.size() );
	*/
	// test isEmpty()
	System.out.println("empty? " + test.isEmpty() );
    }
}
