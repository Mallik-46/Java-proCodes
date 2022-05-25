class qwerty{
	public static void test(int num){

int[] res=new int[10];

int n=0,rem=0;

while(num>0){
	rem=num%2;

res[n++]=rem;
num/=2;
}
for (int i=n-1;i>=0 ;i-- ) {
	

System.out.println(res[i]+" ");

}
}

public static void  increment(int [] a){

	int temp=0;
	for(int i=0;i<a.length;i++){
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
		for(int b:a)System.out.print(b+" ");

}


	public static void increment1(int[] a){
int temp=0;
System.out.println("'\n'------------------------------------------------------");
		for(int j=0;j<a.length-1;j++)
		{
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
for(int b:a)System.out.print(b+" ");

	}
	

	public static void main(String[] args) {

		

 
System.out.println("program starts");
fdx
test(25);

int []a={8,9,5,1,2,0,10,4,3,6};
increment(a);
increment1(a);


	}

}
