import java.lang.*;
import java.io.*;

public class FileReadWrite
{
	private File file;				
	private FileWriter writer;		
	private FileReader reader;		
	private BufferedReader bfr;		
	
	/*
	public void writeInFile(String s)
	{
		/*
			creating a file and writing in it genarates compile time exceptions (Checked Exceptions).
			So, we need to write the whole thing in try-catch.
		*/
	/*	try
		{
			file = new File("History.txt");			//Declaring a file named named History.txt for creating.
			file.createNewFile();					//If the file does not exists, creates and opens the file. else, just opens the file
			writer = new FileWriter(file, true);	//creating the writer object to write in the file.
			writer.write(s+"\r"+"\n");				//writing a string s in the file. the "\r" and "\n" has been concat to go to a newline.
			writer.flush();							//After writing, we need to flush to indicate that we have completed writing.
			writer.close();							//After flushing, we need to close the file to save our writing.
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public void readFromFile()
	{
		/*
			reading from a file genarates compile time exceptions (Checked Exceptions).
			So, we need to write the whole thing in try-catch.
		*/
		
	/*	try
		{
			reader = new FileReader(file);			
			bfr = new BufferedReader(reader);		
			String text="", temp;					
			
			while((temp=bfr.readLine())!=null)		
			{
				text=text+temp+"\n"+"\r";			
			}
			
			System.out.print(text);   				
			reader.close();							
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	} */

	
	
	try{
		FileWriter writer = new FileWriter("history.txt");
		Scanner s = new Scanner(System.in);
		String ii = s.nextLine();
		writer.write(ii);
		writer.close();
	}
	catch(IOException e)
	{System.out.println(e);}
	try{
		FileReader reader = new FileReader("customerlist.txt");
		int fileCharacters;
		System.out.println("Customer details: ");
		while((fileCharacters = reader.read()) != -1)
		{

			System.out.print((char)fileCharacters);
		}
		reader.close();
	}
	catch(IOException e)
	{System.out.println(e);}
	System.out.println(" ");
	
	
}