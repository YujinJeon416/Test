package ncs.test7;
public class Student extends Human {
	private String number;
	private String major;

	public Student() {
		super();
	}

	public Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\t"+this.number+"\t"+this.major;
	}

}