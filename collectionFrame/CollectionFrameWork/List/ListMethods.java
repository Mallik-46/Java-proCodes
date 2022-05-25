import java.util.*;


class ListMethods{

public static void main(String[] args) {
	System.out.println("start the the program");

   List<String> obj=new ArrayList<String>();
    
    obj.add("hello");
     obj.add("Arjun");
    obj.add("hi");
    obj.add("my");
    obj.add("name");
    obj.add("is");
 // this method from the collectio interface
    System.out.println(obj);
System.out.println(obj.size());

   obj.add(5,"Mallik");
    obj.add(6,"Arjun");

   




System.out.println(obj.indexOf("Arjun")+"       indexOf()");
System.out.println(obj.lastIndexOf("Arjun")+"   lastindexOf()");
System.out.println(obj.get(5)+"      get()");
System.out.println(obj.remove(2));
System.out.println(obj.set(0,"Mallik"));

ArrayList as=new ArrayList();
as.add("java");
as.add("Mallik");
as.add("Arjun");
System.out.println(obj.addAll(0,as));
  
System.out.println(obj);

}}