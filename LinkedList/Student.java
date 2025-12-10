package LinkedList;

public class Student {
    private int roll_no;
	private String name;
	private int age;
	private String gender;
	
	public Student() {
		super();
	}
	
	public Student(int roll_no, String name, int age, String gender) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void print() {
		System.out.println("Roll no: " + getRoll_no() + "\nName :" + getName() + "\nAge: " + getAge() + "\nGender: " + getGender());
	}
}
