package aggregationassignment;

public class Test {

	public static void main(String[] args) {
		Name name = new Name("Ankita","Sunil","Gadge");
		Address address = new Address("Pune","Maharashtra","India");
		Student student=new Student(1, name, address);
		student.display();
	
		
	}

}
