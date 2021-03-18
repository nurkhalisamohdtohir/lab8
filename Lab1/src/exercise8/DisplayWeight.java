package exercise8;

public class DisplayWeight
{
	public static void main(String[] args)
    {
		CallHumanWeight w = new CallHumanWeight();
		w.setWeight(100);
		double earth = w.weightEarth();
		double mars = w.weightMars();
	
		System.out.print("\n");
		System.out.print("If you weighed " + earth + " lbs on Earth, \n");
		System.out.print("you would weighed only " + mars + " lbs on Mars \n");


    }

}
