
public class Main {
	

	public static void main (String[] args) 
	{
		for(int i=1;i<=100;i++)
		{
		String Answer = FizzBuzz(i);
			if(Answer.equals(""))
			       System.out.println(i);
			else
				 System.out.println(Answer);
		}
	}

	
	static String FizzBuzz(int n) {
		String Result= "";
		if (n%3 == 0)
			Result = Result + "Fizz";//if the number is divided by 3
		if (n%5 == 0)                        
			Result =Result + "Buzz"; // if the number is divided by 5
		return Result;        //if the number is divided by 3 and 5 it will add fizz and buzz 
	}

	
}