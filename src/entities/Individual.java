package entities;

public class Individual extends Contribuinte {

	private Double health;
	
	public Individual () {
		
	}
	
	public Individual (String name, Double income, Double health) {
		super(name, income);
		this.health = health;
	}
	
	public Double getHealth() {
		return health;
	}
	
	public void setHealth(Double health) {
		this.health = health;
	}
	
	@Override
	public Double taxes() {
		
		if (getIncome() < 20000) {
			
			return getIncome () * 0.15;
		}
		else {
			return (getIncome()*0.25) - (health * 0.5); 
		}
	}
	

}
