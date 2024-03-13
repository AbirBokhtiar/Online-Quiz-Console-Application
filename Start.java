import java.util.*;
import java.lang.*;
import java.io.*;

public class Start {
	private static File file;				
	private static FileWriter writer;		
	private static FileReader reader;		
	private static BufferedReader bfr;
    public static void main(String[] args) {

        /*
        //We are telling the scanner class to read the input from input stream
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character");
        char singleChar = scan.next().charAt(0);
        System.out.println(singleChar);
         */
        	
		
		
		Scanner sc= new Scanner(System.in);
		
		/*System.out.println("Enter Student Name: ");
		String Name=sc.nextLine();
		
		System.out.println("Enter Student Id: ");
		String Id=sc.nextLine();
		Student s=new Student(Name,Id);*/
		
		//Random rand = new Random();
		//int upperbound=5;
		//int random = rand.nextInt(upperbound);
		Quiz quiz = new Quiz();
		boolean done = true;
		while (done)
		{
			System.out.println("Enter 1 or 2");
			int x= sc.nextInt();
			
			switch(x)
			{
				case 1:
					sc.nextLine();
					System.out.println("Enter Student Name: ");
					String Name=sc.nextLine();
					
					System.out.println("Enter Student Id: ");
					String Id=sc.nextLine();
					Student s=new Student(Name,Id);
					quiz.begin();
					s.showDetails();
					System.out.println();
					break;
				case 2:
					sc.nextLine();
					System.out.println("Enter Student Name: ");
					String str=sc.nextLine();
					try
					{
						file = new File("History.txt");			
						file.createNewFile();					
						writer = new FileWriter(file, true);	
						writer.write(str+"\r"+"\n");				
						writer.flush();							
						writer.close();							
					}
					catch(IOException ioe)
					{
						ioe.printStackTrace();
					}
				try
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
					done= false;
					break;
					/*try{
						FileWriter writer = new FileWriter("history.txt");
						String ii = sc.nextLine();
						writer.write(ii);
						writer.close();
					}
					catch(IOException e)
					{System.out.println(e);}
					try{
						FileReader reader = new FileReader("history.txt");
						int fileCharacters;
						System.out.println("student details: ");
						while((fileCharacters = reader.read()) != -1)
						{

							System.out.print((char)fileCharacters);
						}
						reader.close();
					}
					catch(IOException e)
					{System.out.println(e);}
					System.out.println(" ");
					done = false;
					break;*/
			}
		}
	}
}