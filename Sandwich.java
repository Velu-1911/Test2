package Question3;

public class Sandwich extends Food {
	String name;
	int cost;
	public String getName() {
		return name;
	}
	public int getCost() {
		return cost;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Sandwich(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}

}
