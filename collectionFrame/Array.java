import java.util.*;


class Array{

public static void main(String[] args) {
	System.out.println("start the the program");

   Collection<Object> obj=new ArrayList<Object>();
    
    obj.add("hello");
    obj.add("hi");
    obj.add("my");
    obj.add("name");
    obj.add("is");
    obj.add("Mallik");
    obj.add("Arjun");
    System.out.println(obj);
//Collections methods
var a="Arjun";
ArrayList as=new ArrayList();
as.add("Mallik");
as.add("Arjun");
as.add("king");
System.out.println(obj.add("bye")+"add()");
System.out.println(obj.isEmpty()+"isEmpty()");
System.out.println(obj.size()+"size()");
System.out.println(obj.contains(a)+"contains()");
System.out.println(obj.containsAll(as)+"containsAll");
System.out.println(obj.addAll(as)+"addAll");
System.out.println(obj );
System.out.println(obj.retainAll(as)+" retainAll()");
System.out.println(obj.remove("Mallik")+"remove()");
System.out.println(obj.removeAll(as)+"removeAll()");
System.out.println("clear() it doesn't return anything");
obj.clear();//clear() method
System.out.println(obj);
}
}