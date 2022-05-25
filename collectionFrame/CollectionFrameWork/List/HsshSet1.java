import java.util.*;
class HsshSet1{


public static void main(String[] args) {
	System.out.println("progarm Start");



  LinkedHashSet<String> h1=new LinkedHashSet<String>();

System.out.println(h1.add("java"));
System.out.println(h1.add("Html"));
System.out.println(h1.add("Corejava"));
System.out.println(h1.add("Sql"));
System.out.println(h1.add("Css"));
System.out.println(h1.add("java"));
System.out.println(h1.add("Jdbc"));
System.out.println(h1.add("Spring"));
System.out.println("--------------------------------------------------");

for(String a:h1)System.out.println(a);

System.out.println("-------------------cursour----------------------");
Iterator itr=h1.iterator();

while(itr.hasNext())
System.out.println(itr.next());


}
}