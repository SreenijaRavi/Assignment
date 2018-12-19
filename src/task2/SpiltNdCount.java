package task2;

import java.util.Scanner;

public class SpiltNdCount 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter paragraph");
	 String s1=sc.nextLine();
	String[] word=s1.split(" ");
	int andCount=0;
	int isCount=0;
	for (String temp:word)
	{
		if(temp.equalsIgnoreCase("and"))
		{
			andCount++;
		}
		if(temp.equalsIgnoreCase("is"))
		{
			isCount++;
		}
	}
	System.out.println(andCount+" and's are present \n"+isCount+" is's are present");
	
}
}

