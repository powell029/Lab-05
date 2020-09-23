import java.util.*;

class Student
{
	int test1, test2;
	String name;
	
	public Student(String studentName)
	{
		name = studentName;
	}
	
	public void inputGrades()
	{
		Scanner Sc = new Scanner(System.in);
		do
		{
			System.out.println("Enter " + name + "'s First Test Grade:");
			test1 = Sc.nextInt();
			if(test1 < 0 || test1 > 100)
			{
				System.out.println("Not a correct value to enter. ");
				continue;
			}
			else
			{
				break;
			}
		}while(true);
		
		do
		{
			System.out.println("Enter " + name + "'s Second Test Grade:");
			test2 = Sc.nextInt();
			if(test2 < 0 || test2 > 100)		
			{
				System.out.println("Not a correct value to enter. ");
				continue;
			}
			else
			{
				break;
			}
		}while(true);
	}
	
	public int getAverage()
	{
		int average = test1 + test2;
		return average/2;
	}
	
	public String getName()
	{
		return name;
	}
	public String toString()	
	{
		return "Name: " + name + " Test1: " + test1 + " Test2: " + test2;
	}
	
}