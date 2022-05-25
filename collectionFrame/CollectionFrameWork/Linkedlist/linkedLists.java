import java.util.*;

class linkedLists{

public static void main(String[] args) {
	System.out.println("program start here");

Stack<Integer> llist=new Stack();

 llist.push(123);
 llist.push(234);
 llist.push(345);
 llist.push(456);
 llist.push(567);


 System.out.println(llist);
 System.out.println(llist.pop());///it remove and return the top of the stack
 System.out.println(llist);
 System.out.println(llist.peek());//it returns only tp of the stack
 System.out.println(llist);
 System.out.println(llist.search(2000)); //it returns the index +1 of the given value 
  										// if no such element it returns -1 
 System.out.println(llist.size()-3);

 
//push()
//pop()
//peeek()
//search()





SortedSet sset=new TreeSet<>();
 
sset.add(123);
sset.add(231);
sset.add(125);
sset.add(888);
 
sset.add(55);
sset.add(271);
sset.add(105);
sset.add(818);
System.out.println(sset);


System.out.println( sset.first());
System.out.println(sset.last());
System.out.println(sset);

System.out.println(llist.tailSet(n));


}


}