
public class Main {
	

	public static void main (String[] args) 
	{
		for(int i=1;i<=100;i++)
		{
		String Answer = FizzBuzz(i);
		if(Answer.equals("None"))
	       System.out.println(i);
		else
			System.out.println(Answer);
		}
	}

	
	static String FizzBuzz(int n) {
		if(n%3 == 0)
			return "Fizz";
		else
			return "None";
	}

	
}