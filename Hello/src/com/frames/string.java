package com.frames;

public class string {
	
	int add(int n1,int n2)
	{
		 return n1+n2;
		 
	}

	int add(int n1,int n2,int n3,int n4)
	{
		
		return n1+n2+n3+n4;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		string obj = new string();
		System.out.println("sum of two numbers" +obj.add(10, 12));
		System.out.println("sum of three numbers" +obj.add(10, 12, 21, 30));
		
		//String s = new String("Durga");
		//s.concat("Software");
		//System.out.println("String is  "  +s);
		
		//StringBuffer sb = new StringBuffer("Durga");
		//sb.append("Software");
		//System.out.println("String Buffer is "+sb);
		
		

	}

}
