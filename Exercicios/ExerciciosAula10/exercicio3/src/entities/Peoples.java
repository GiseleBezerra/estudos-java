package entities;

public class Peoples {
	
	private String name;
	private int age;
	private double height;
	
	public Peoples(String name, int age, double height) {
			this.name = name;
			this.age = age;
			this.height = height;
		}
	
	public String toString() {
		return String.format("Nome: %s | Idade: %d | Altura: %.2f", this.getName(), this.getAge(), this.getHeight());
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
