class Person
{
	String name;
	int age;
}									//class person	
class Myprogramperson {
    public static void main(String[] args) {
	Person p1=new Person();			//create object
	Person p2=new Person();		    //create object	
	p1.name="mode";
	p1.age=71;						//we access data member of person class
	p2.name="Bachchan";
	p2.age=80;
	System.out.println("p1.name="+p1.name);
	System.out.println("p2.name="+p2.name);
	System.out.println("p1.age="+p1.age);
	System.out.println("p2.age="+p2.age);
    }								//main end here
}