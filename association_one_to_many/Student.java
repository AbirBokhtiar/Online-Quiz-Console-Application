import java.lang.*;
public class Student
{
	
	private String name;
	private String id;
	
	public Student()
	{
		
	}
	
	public Student(String name,String id)
	{
		this.name=name;
		this.id=id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setId(String i)
	{
		this.id=id;
	}
	
	
	public void setCourse(Course c[])
	{
			courses=c;
		
	}
	public void getCourse()
	{
		int count=courses.length;
		for(int i=0;i<count;i++)
		{
		System.out.println("Course name is: "+courses[i].getCname());
		System.out.println("Course id is: "+ courses[i].getCid());
		}
		
		/*		
		int count=courses.length;
		System.out.println("You have "+count+ " Courses");
		for(int i=0;i<courses.length;i++)
		{
			if (courses[i]!=null)
			{
		System.out.println("Course name is: "+courses[i].getCname());
		System.out.println("Course id is: "+ courses[i].getCid());
			}
		}
		*/
	}
	
	
	public String getName()
	{
		return name;
	}
	public String getId()
	{
		return id;
	}
	public double getCgpa()
	{
		return cgpa;
	}
	public void showDetails()
	{
		System.out.println("Name is : "+name);
		System.out.println("Id is : "+id);
		System.out.println("Cgpa is : "+cgpa);
		
				
	}
}