package Question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import Question4.NeutralTree;
import Question4.QuantumTree;
import Question4.TreeMain;
import Question4.binaryTree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int price=0;
		
		ArrayList<Food> list = new ArrayList<Food>();
		ArrayList<Sandwich> sandwich = new ArrayList<Sandwich>();
		ArrayList<Drink> drink = new ArrayList<Drink>();
		ArrayList<Salad> salad = new ArrayList<Salad>();
		String[] sand = {"Cheese","Chicken","Chicken club"};
		int[] sandPrice = {2,3,4};
		String[] Drink = {"Pepsi","Cola","Smoothie"};
		int[] driPrice = {2,3,4};
		String[] SaladStr = {"Diet","Veggie","Chicken"};
		int[] salaPrice = {2,3,4};
		
		for(int i=0;i<3;i++) {
			Sandwich s = new Sandwich(sand[i],sandPrice[i]);
			list.add(s);
			sandwich.add(s);
		}
		for(int i=0;i<3;i++) {
			Salad s = new Salad(SaladStr[i],salaPrice[i]);
			list.add(s);
			salad.add(s);
		}
		for(int i=0;i<3;i++) {
			Drink s = new Drink(Drink[i],driPrice[i]);
			list.add(s);
			drink.add(s);
		}
		
		
		System.out.println("Enter the type of order you want to create");
		System.out.println("1.sandwich");
		System.out.println("2.Drink");
		System.out.println("3.Salad");
		System.out.println("4.Trio");
		int n = in.nextInt();
		
		if(n==1) {
			System.out.println("enter the name of the sandwich");
			String order = in.next();
			int ind =Integer.MIN_VALUE;
			for(int i=0;i<3;i++) {
				if(order.equals(sandwich.get(i).getName()))
				{
					ind = i;
				}
			}
			price = sandwich.get(ind).getCost();
			System.out.println(price);
			
		}
		if(n==2) {
			System.out.println("enter the name of the drink");
			String order = in.next();
			int ind =Integer.MIN_VALUE;
			for(int i=0;i<3;i++) {
				if(order.equals(drink.get(i).getName()))
				{
					ind = i;
				}
			}
			price = drink.get(ind).getCost();
			System.out.println(price);
			
		}
		if(n==3) {
			System.out.println("enter the name of the salad");
			String order = in.next();
			int ind =Integer.MIN_VALUE;
			for(int i=0;i<3;i++) {
				if(order.equals(salad.get(i).getName()))
				{
					ind = i;
				}
			}
			price = salad.get(ind).getCost();
			System.out.println(price);
			
		}
		if(n==4) {
			 int cost[] = new int[3];
			System.out.println("enter the name of the sandwich");
			System.out.println("enter the name of the drink");
			System.out.println("enter the name of the salad");
			String order = in.next();
			int ind =Integer.MIN_VALUE;
			for(int i=0;i<3;i++) {
				if(order.equals(sandwich.get(i).getName()))
				{
					ind = i;
				}
			}
			cost[0]= sandwich.get(ind).getCost();
			String dr = in.next();
			for(int i=0;i<3;i++) {
				if(dr.equals(drink.get(i).getName()))
				{
					ind = i;
				}
			}
			cost[1] =drink.get(ind).getCost(); 
			String sa = in.next();
			for(int i=0;i<3;i++) {
				if(sa.equals(drink.get(i).getName()))
				{
					ind = i;
				}
			}
			cost[2] =salad.get(ind).getCost(); 
			Arrays.sort(cost);
			price = cost[2]+cost[1];
			System.out.println(price);
		}
		
		
		
		for(int i=0;i<3;i++) {
			sandwich.get(i).getName();
			salad.get(i).getName();
			drink.get(i).getName();
		}
		
		

	}

}
