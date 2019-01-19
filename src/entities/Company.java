package entities;

public class Company extends Contribuinte {

	private Integer employees;
	
	
	public Company () {
		
	}
	
	public Company (String name, Double income, Integer employees) {
		super(name, income);
		this.employees = employees;
	}
	
	public Integer getEmployees() {
		return employees;
	}
	
	public void setEmployess(Integer employees) {
		this.employees = employees;
	}
	
	@Override
	public Double taxes() {
		if (employees > 10) {
			return getIncome()* 0.14;
		}
		else {
			return getIncome() * 0.16;
		}
	}

}
