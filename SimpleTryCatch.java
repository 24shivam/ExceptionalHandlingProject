import java.util.Scanner ;
public class SimpleTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			
		
		Scanner scan = new Scanner (System.in);
		System.out.println("the work of calculation start now");
		System.out.println("Kindly enter the number");
		int x=scan.nextInt();
		System.out.println();
		System.out.println("Kindley enter the number for denominator");
		int y=scan.nextInt();
		int res=x/y;
		System.out.println(res);
		System.out.println("result out");
		
		}
		
		
		catch(Exception e)
		{
			System.out.println("please enter the non zero in denominator");
		}
		
		finally
		{//in any case it will executed any how either exception occur or not
			System.out.println("finally");
		}
		System.out.println("operation termination");

	}

}
