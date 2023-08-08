package Question3;

public class Salad extends Food{
	String name;
	int cost;
	public String getName() {
		return name;
	}
	public int getCost() {
		return cost;
	}
	public Salad(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}

}
