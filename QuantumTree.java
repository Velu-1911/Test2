package Question4;

public class QuantumTree extends TreeMain {
	
	int hours=0;
	String name;
	int energy;
	
	public int getHours() {
		return hours;
	}
	
	@Override
	void sethours(int n) {
		// TODO Auto-generated method stub
		this.hours = n;
	}

	
	
	public QuantumTree(String name) {
		super();
		this.name = name;
		System.out.println("Quantum tree is created " + name);
	}

	@Override
	public int absorbSunlight(int hours) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void getTreeDetails() {
		// TODO Auto-generated method stub
		System.out.println("hello Quantum " + name + "-" + energy);
		
		
		
	}
	
	@Override
	public int calcEnergy() {
		energy = 3*(hours*hours);
		return energy;
	}
	
	

}
