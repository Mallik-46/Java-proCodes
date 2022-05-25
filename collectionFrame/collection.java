import java.util.*;

class collection{


public static void main(String[] args) {
	System.out.println("program start");
  collections obj=new collections();


  //obj.arraylist();

  //obj.linkedlist();
  //obj.vector();
  //obj.stack();


obj.cursors();
















 }}



//add(object o)
////remove(object o)

//addAll(collection c)
//removeAll(collection c)\
//clear()
//retainALl(collection)
//----------------------------------------------------------------------------

//list interface------\
  
  // list contain specific method
    // add(int index object o)
/*
addAll(int index collection c)::::: index->fromthis index
remove(int index)-> remove sthat indexobject
l.indexOf("a")------>it provide index value of the first located 
l.lastIndex("a")------->it similer too but 2nd index 
get(int index)  ----- if we want to get specific indexobject then wego for this 
set(ind index ,object o) it replace the object at the specified index 




*/


 class collections{
 

 //  --------------- ArrayList---------------------------



public static void arraylist(){

 ArrayList a=new ArrayList();

//constructor
ArrayList b =new ArrayList(100);

a.add("a");//it add the object insertion order 
a.add("b");
a.add("c");
a.add("d");
a.add("10");
System.out.println(a);
a.remove(4);///// it remove the specified index
System.out.println(a);
a.add(4,"e");// add the object at specific index
System.out.println(a);
a.remove("e");
System.out.println(a);
 
System.out.println(a);
a.add(0,'@');
System.out.println(a);


System.out.println("                -------------------  end ------------------");
System.out.println();


}

public static void linkedlist(){

// --------------- LinkedList---------------------------

	LinkedList a=new LinkedList();


//constructor we can add any collection object
 LinkedList b=new LinkedList();
System.out.println("           ----------linkedlist start from here---------");System.out.println();

a.add("Mallik");
a.add("Arjun");
a.add("guru");
a.add("abhi");
a.add("sanjeev");
a.add("akshay");
System.out.println(a);
a.add(0,"link");

a.addFirst("start");
System.out.println(a);
a.removeFirst();
a.addLast("end");
System.out.println(a);
a.removeLast();
System.out.println(a.get(1)); System.out.println();
  System.out.println();
}
  

//all the method are synchronzed 

public void vector(){

// --------------- Vector---------------------------

System.out.println("------------------vector program start from here --------------");

Vector b=new Vector();//constructor   
Vector a=new Vector(100);//initialize memory location   new capacity= 2*current capacity
Vector v= new Vector(100,5);//here intialize the vector initialize capacity and increment by 5
System.out.println(a.capacity());

a.add("mallik");
a.addElement("Arjun");
a.addElement("kagdkuga");System.out.println(a);
a.removeElement("kagdkuga");a.addElement("king");
System.out.println(a.size());
a.remove(2);
System.out.println(a);
System.out.println(a.get(0)+" "+a.get(1));






System.out.println();System.out.println();System.out.println();


}

//stack is a specially designed   is LIFO last in firstout
public void stack(){


  // --------------- Stack---------------------------


  System.out.println("----->------>-------stack method start from here -------<-------<------");
System.out.println();

Stack a=new Stack();

 
//  push()  to add an object
//  pop() it remove the object and return last element of the object
//  peek() to return top of the stack  it dont remove
//  empty() to check the 
//  search() it return offset value
a.add("a");
a.add("b"); 
a.add("c");
a.add("d");   
a.add("e");
a.add("f"); 
System.out.println(a);
System.out.println(a.pop() + " pop() method remove the top of the stack");//it returns the top of the stack anf=d it also remove that perticular objet 


System.out.println(a);
Object b=a.peek();
System.out.println(a.pop());System.out.println(a);



}


/*  --------------- three cursor in java--------------------- 

if we want to retrive object one by one from the collection then we go 
for cursor
there are three types of cursors are aviilable in java
            

              *Enumeration
              *Iterator
              *ListIterator
  
*/


public void cursors(){

 // --------------- Stack---------------------------

System.out.println( "--------------- Enumeration---------------------------");

      Vector s=new Vector();


//hasmoreElements();
//nextElemnts();

for(int i=0;i<=10;i++){
  s.add(i);
}


  System.out.println(s);



           Enumeration e =s.elements();

while(e.hasMoreElements()){
  Integer i=(Integer)e.nextElement();
  if(i%2==0)
    System.out.println((i));

}
   




  System.out.println("----------iterattor-----------");


// iterator provide remome element  its only one direction move towords forward direction

ArrayList a1 =new ArrayList();
for(int i1=1;i1<=20;i1++){
  a1.add(i1);
}


Iterator itr=a1.iterator();

while(itr.hasNext()){
Integer i=(Integer)itr.next();

if(i%2==0)System.out.print(i+" ");
else itr.remove();
 
}
System.out.println();
System.out.println(a1.get(0));

System.out.println(a1);




////////   list iterator is bidirectional cursor ///////////////////
      

      //   --------->   we can perform 
      //   read 
      //   remove
      //   replacement
      //   additon of new object
      //   


    /*
       forword operation   


         public boolean hasnext();
         public object next();
         public int nextIndex();


       previous  operation   
           
          public boolean hasprevious()
          public object previous();
          public int   previousIndex();



          public void remove();
          public void set();
          public void add();


     */
    

LinkedList lis=new LinkedList();

lis.add("hi");
lis.add("hello");
lis.add("hola");
lis.add("bye");
lis.add("morning");
lis.add("afternoon");
lis.add("night");
System.out.println(lis);


ListIterator ltr=lis.listIterator();

while(ltr.hasNext()){

  String sk=(String)ltr.next();

  if(sk.equals("hola")){
    ltr.remove();
  }

else if(sk.equals("morning"))ltr.set("");
else if(sk.equals("afternoon"))ltr.set("");
else if(sk.equals("night"))ltr.set("");

}

System.out.println(lis);



}} 













