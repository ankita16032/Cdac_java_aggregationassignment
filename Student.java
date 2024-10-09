package aggregationassignment;

public class Student {

	private int rollNo;
	private Name name;
	private Address address;
	public Student(int rollNo, Name name, Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("RollNo : "+rollNo);
		System.out.println("Name  : "+name);
		System.out.println("Address : "+address);
	}
	
	
	
}
