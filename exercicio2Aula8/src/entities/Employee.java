package entities;

public class Employee {
	
	public String name;
	public double glossSalary;
	public double tax;
	
	public double netSalary() {
		return glossSalary - tax;
	}
	
	public String toString() {
		return "Funcionário: "
			+ name
			+ ", $ "
			+ String.format("%.2f", netSalary());
	}
	
	public void increaseSalary(double porcentagem) {
		
		this.glossSalary += this.glossSalary * (porcentagem /100);
		
		
	}

}
