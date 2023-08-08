package Question4;

import java.util.*;

public  class ForestManagerMain {
	
	static int Totalsunlight=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sunlight=0;
		ArrayList<TreeMain> treeli = new ArrayList<TreeMain>();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of trees you want to create");
		int n = in.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the type of trees you want to create");
			System.out.println("Binary or  Quantum  or Neutral");
			String type = in.next();
			System.out.println("ENter the name of the tree you want to create");
			String name = in.next();
			if(type.equals("Binary")){
				TreeMain b = new binaryTree(name);
				treeli.add(b);
			}
			if(type.equals("Quantum")){
				TreeMain b = new QuantumTree(name);
				treeli.add(b);
			}
			if(type.equals("Neutral")){
				TreeMain b = new NeutralTree(name);
				treeli.add(b);
			}
		}
		
		sunlight =  produceEnergyForForest(2,treeli,n);
		
		
		System.out.println(sunlight);
		
		getforestReport(sunlight, treeli, n);
		
	}

	public static void getforestReport(int sunlight, ArrayList<TreeMain> treeli,int size) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++) {
			treeli.get(i).getTreeDetails();
		}
		System.out.println("Total energy is " + sunlight);
	}

	public static int produceEnergyForForest(int n, ArrayList<TreeMain> treeli,int size){
		int sun=0;
		for(int i=0;i<size;i++) 
		{
			treeli.get(i).sethours(n);
			int a = treeli.get(i).calcEnergy();
			sun+=a;
		}
		
		return sun;
		
	}

}
