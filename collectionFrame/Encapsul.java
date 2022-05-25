class encapsulation {


private int id;
private String name;
private String email;


public void setName(String name){
	if(this.name==null)
	this.name=name;

}
public void setId(int id){
	if(this.id==0)
	this.id=id;}
public void setEmail(String email){
	if(this.email==null)
	this.email=email;}

public String getName(){
	return this.name;
}
public String getemail(){
	return this.email;
}


}
class Encapsul{

	public static void main(String[] args) {
 		System.out.println("progrma start");
      
      var obj=new encapsulation();

      obj.setName("mallik");
      obj.setId(23);
      obj.setEmail("mallik@123"); 
      obj.setName("guru");
      System.out.println(obj.getemail());
      System.out.println(obj.getName());
  
	}
}