import java.util.Scanner;

class UnderAgeException extends Exception
{
	public  UnderAgeException(String message) {
		super (message);
	}
}
class OverAgeException extends Exception
{
	public  OverAgeException(String message) {
		super (message);
	}
}
class ApplicantDetails{
	int age;
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("kindly enter the Name");
	    String name=scan.nextLine();
	    System.out.println("kindly enter the age for eligibility check");
	    age=scan.nextInt();
	    
		
	}
	//public void check() throws Exception
	public void check() throws UnderAgeException,OverAgeException
	
	{
		if(age<18) 
		{
			UnderAgeException uae=new UnderAgeException("UNDER-AGE");
			System.out.println(uae.getMessage());
			throw uae;
		}
		else if(age>65) 
		{
			OverAgeException oae= new OverAgeException("OVER-AGE");
			System.out.println(oae.getMessage());
			throw oae;
		}
		else 
		{
			System.out.println("you are eligible");
		}
		
}}
class rto{
	public void initate() 
	{
		ApplicantDetails ad=new ApplicantDetails();
		try {
			ad.input();
			ad.check();
		}
		catch(UnderAgeException | OverAgeException e) {
			try {
				ad.input();
				ad.check();
			}
			catch(UnderAgeException | OverAgeException e1) {
				try {
					ad.input();
					ad.check();
				}
				catch(UnderAgeException | OverAgeException e2) {
					System.out.println("YOUR APPLICATION  FORM REJECTED");
				}
			}
		}
		finally {
			System.out.println("PROGRAM OVER");
		}
	}
}
public class RtoExceptionCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rto ro=new rto();
		ro.initate();

	}

}
