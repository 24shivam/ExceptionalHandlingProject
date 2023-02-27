import java.util.Scanner;

class niceCoupleException extends Exception{
	
	public niceCoupleException(String message) 
	{
		super(message);
	}
}
class goodCoupleException extends Exception{
	
	public goodCoupleException(String message) 
	{
		super(message);
	}
}
class BetterLuckException extends Exception{
	
	public BetterLuckException (String message) 
	{
		super(message);
	}
}



class CoupleMatch
{
	
	String bColour,bname,bPlace,bweather;
	int bage,bNum;
	String gColour,gname,gPlace,gweather;
	int gage,gNum;
	public void boyInput() 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("DUDE ENTER YOUR NAME");
		bname=scan.nextLine();
		System.out.println("DUDE ENTER YOUR COLOR");
		bColour=scan.nextLine();
		System.out.println("DUDE ENTER YOUR PLACE");
		bPlace=scan.nextLine();
		System.out.println("DUDE ENTER YOUR WEATHER");
		bweather=scan.nextLine();
		System.out.println("DUDE ENTER YOUR AGE");
		bage=scan.nextInt();
		System.out.println("DUDE ENTER YOUR NUMBER");
		bNum=scan.nextInt();
		System.out.println("now your future patner turn");	
	}
	public void girlInput() 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("HEY GIRL ENTER YOUR NAME");
		gname=scan.nextLine();
		System.out.println("HEY GIRL ENTER YOUR COLOR");
		gColour=scan.nextLine();
		System.out.println("HEY GIRL ENTER YOUR PLACE");
		gPlace=scan.nextLine();
		System.out.println("HEY GIRL ENTER YOUR WEATHER");
		gweather=scan.nextLine();
		System.out.println("HEY GIRL ENTER YOUR AGE");
		gage=scan.nextInt();
		System.out.println("HEY GIRL ENTER YOUR NUMBER");
		gNum=scan.nextInt();
		System.out.println("okay now wait");	
	}
	
	public void verify() throws niceCoupleException,goodCoupleException,BetterLuckException
	{
		if((bColour.equals( gColour))&& (bage==gage) && (bNum==gNum) && (bweather.equals(gweather)) )
		{
			System.out.println("YOU ARE PERFECT COUPLE---> 100% MATCH FOUND");
		}
		else if((bColour .equals (gColour)) && (bNum==gNum) && (bweather.equals(gweather))) 
		{
			niceCoupleException ce = new niceCoupleException("GOOD TO GO  ---> 70%");
			System.out.println(ce.getMessage());
			throw ce;
		}
		else if((bColour.equals(gColour)) && (bNum==gNum)) 
		{
			goodCoupleException ge = new goodCoupleException(" IT'S UP TO YOU ----> 50%");
			System.out.println(ge.getMessage());
			throw ge;
		
		}
		else  
		{
			BetterLuckException gl = new 	BetterLuckException (" BETTER LUCK NEXT TIME ");
			System.out.println(gl.getMessage());
			throw gl;
			
		}
	}
	
}
class MatchChecking{
	public void initiate() 
	{
		CoupleMatch cm=new CoupleMatch();
		try 
		{
			cm.boyInput();
			cm.girlInput();
			cm.verify();
		}
		catch(niceCoupleException|goodCoupleException|BetterLuckException e) {
			System.out.println("THANKS FOR USING OUR APPLICATION ");
		}
	}
}





public class ValentineGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MatchChecking m=new  MatchChecking();
		 m.initiate();

	}

}
