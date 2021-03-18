package exercise8;

import java.util.Scanner;

public class CallHumanWeight 
{
    Scanner keyboard = new Scanner(System.in);
	
	public double weight;


    public void setWeight(double weight)
    {
        this.weight = weight;
    }


    public double weightEarth()
    {
		double earth = (weight * 1);
		return earth;

    }
	
	public double weightMars()
    {
		double mars = (weight * 0.38);
		return mars;

    }
}