package Question4;

public class binaryTree extends TreeMain{
	
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

	public binaryTree(String name) {
		super();
		this.name = name;
		System.out.println("Binary tree is created " + name);
	}

	public int absorbSunlight(int hours) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void getTreeDetails() {
		// TODO Auto-generated method stub
		System.out.println("hello binary " + name + "-" + energy);
		
	}
	
	
	@Override
	public int calcEnergy() {
		energy = 2*hours;
		
		return energy;
	}


}
