package ncs.test8;

public class User {
	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;

	public User() {
		super();
	}

	public User(String id, String password, String name, int age, char gender, String phone) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+"\t"+this.password+"\t"+this.name+"\t"+this.age+"\t"+this.gender+"\t"+this.phone;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result=true;
		if(!this.id.equals(((User)obj).getId())){
			result = false;
			return result;
		}
		if(!this.password.equals(((User)obj).getPassword())){
			result = false;
			return result;
		}
		if(!this.name.equals(((User)obj).getName())){
			result = false;
			return result;
		}
		if(!(this.age==((User)obj).getAge())){
			result = false;
			return result;
		}
		if(!(this.gender==((User)obj).getGender())){
			result = false;
			return result;
		}
		if(!this.phone.equals(((User)obj).getPhone())){
			result = false;
			return result;
		}
		return result;
	}

	public Object clone() {
		return new User(id, password, name, age, gender, phone);		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
