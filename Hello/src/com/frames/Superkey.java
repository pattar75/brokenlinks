package com.frames;

public class Superkey {
	
	class Animal 
	{
		
		static String color = "white";
	}

	class Dog extends Animal
	
	{
		  String color ="Black";
		  void printcolor()
		  {
			  System.out.println(color); //prints color of dog class
			   System.out.println(super.color); // prints color of animal class	

		  }
	}
	public static void main(String[] args) {
		
		
		Dog d = new Dog();
				d.printcolor();

	}

}
