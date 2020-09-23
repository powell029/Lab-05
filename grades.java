import java.util.*;
		
public class Grades
{
	public static void main(String[] args)
	{
		Student student1 = new Student("Student 1");
		Student student2 = new Student("Student 2");
		
		student1.inputGrades();
		student2.inputGrades();
		System.out.println(student1);
		System.out.println(student2);
	}
}