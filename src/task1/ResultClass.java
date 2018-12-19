package task1;

import java.util.ArrayList;

public class ResultClass {// class to store results and display
	ArrayList al;

	public ResultClass()       //constructor to create obj of arraylist
	{
		al = new ArrayList();

	}

	public void storeResults(String row)//method to add output from resultset
	{
		al.add(row);

	}

	public void showResults()// method to display the output by using enhanced for loop

	{
		for (Object i : al)

		{
			System.out.println(i);

		}

	}
}
