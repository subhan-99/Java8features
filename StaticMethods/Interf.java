package StaticMethods;

 interface Interf 
{
	public void m1();
	}
class Test 
{
 public static void main(String[] args) {
	 Interf i= ()-> System.out.println("Hello... By Lamda Expression");
     i.m1();	
}
	
}
