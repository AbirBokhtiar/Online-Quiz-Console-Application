import java.lang.*;
public class Start
{
	public static void main(String args[])
	{
		Student s1=new Student("Shakib","11-21121-2",3.0);
		
		Course c0=new Course("math-1","101");
		Course c1=new Course("cse-1","201");
		Course c2=new Course("english-1","301");
		
		Course c[]=new Course[3];
		c[0]=c0;
		c[1]=c1;
		c[2]=c2;
		
		s1.setCourse(c);		
		
		System.out.println("        -----------        ");
		System.out.println("Student name is : "+s1.getName());
		System.out.println("Student ID is: "+s1.getId());
		System.out.println("Student cgpa is "+s1.getCgpa());
		
		System.out.println("        -----------        ");
		s1.getCourse();
		
		System.out.println();
	
		
	}
}