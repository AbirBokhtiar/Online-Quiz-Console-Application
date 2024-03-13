import java.lang.*;
public class Student
{
	
	private String name;
	private String id;
	Quiz q;
	

	
	
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
	
	public String getName()
	{
		return name;
	}
	public String getId()
	{
		return id;
	}
	public void setQuiz(Quiz quiz)
	{
		q=quiz;
	}
	public Quiz getQuiz()
	{
		return q;
	}
	
	//Result result = new Result(countTotal,countRight,countWrong);
	
	public void showDetails()
	{
		System.out.println("Name is : "+name);
		System.out.println("Id is : "+id);
	}
}