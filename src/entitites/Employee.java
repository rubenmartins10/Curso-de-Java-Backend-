package entitites;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;

	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		double percentagem = 0;
		grossSalary += grossSalary * percentage / 100;
	}
	
	public String toString() {
		return "Employee: "
			+ name
			+ ", $ "
			+ String.format("%.2f", netSalary()); 
	}
	
	
}


