package Question3;

public class Drink extends Food{
	String name;
	int cost;
	public String getName() {
		return name;
	}
	
	public int getCost() {
		return cost;
	}
	public Drink(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	
}
