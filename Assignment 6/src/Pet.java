public class Pet {
	
	String name;
	String type;
	int age;
	
	public Pet(String name, String type, int age) {
		this.name = name;	//field = argument
		this.type = type;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
