package Comperator;

public class Student1 {
	
	int id;
	String name;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	

}
