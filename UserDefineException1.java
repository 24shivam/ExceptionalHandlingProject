import java.util.Scanner;

class InvalidException extends Exception{
	public InvalidException(String message) {
		super (message);
	}
	
}

class Atm
{
	int id=29290;
	int code=3030;
	int uid,ucode;
	public void input()
	{
		Scanner scan=new Scanner (System.in);
		System.out.println("kindly enter your ID of atm");
		uid=scan.nextInt();
		System.out.println("kindly enter your password of atm");
		ucode=scan.nextInt();
		
	}
	public void verify() throws InvalidException
	{
		if((id==uid)|(code==ucode)){
			System.out.println("TAKE YOUR CASH");
			
		}
		else
		{
			InvalidException ie=new InvalidException("Are you sure? try again bcz wrong input");
			System.out.println(ie.getMessage());
//			System.out.println(ie);
//			System.out.println("you enter wrong input");
			throw ie;
		}
	}
	
}
class Bank
{
	public void initiate() {
	Atm atm=new Atm();
	try 
	{
		atm.input();
		atm.verify();
	}
	catch(InvalidException ie1)
	{
		try 
		{
			atm.input();
			atm.verify();
		}
		catch(InvalidException ie2) 
		{
			try 
			{
				atm.input();
				atm.verify();
			}
			catch(InvalidException ie3) 
			{
				System.out.println("now you are chor!!!!!!!!!!!");
				System.exit(0);
			}
		}
	}
}
}
public class UserDefineException1 {

	public static void main(String[] args) {
		Bank bank=new Bank();
		bank.initiate();

	}

}
