
public class Person {
	int id;
	String Name;
	
	public Person(int id, String Name) {
		this.id = id;
		this.Name = Name;
	}
	
	public void disp()
	{
		System.out.println("name:"+Name+"\nid:"+id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj1=new Person(13,"sam");
		obj1.disp();
		Person obj2=new Person(12,"jack");
		obj2.disp();
	}

}
