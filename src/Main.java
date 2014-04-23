
public class Main {
	

	public static void main (String[] args) 
	{
		for(int i=1;i<=100;i++)
		{
		String Answer = FizzBuzz(i);
		if(Answer.equals("None"))
	       System.out.println(i);
		else if(Answer.equals("Fizz")) //if the number is divided by 3
			System.out.println(Answer);
		else if(Answer.equals("Buzz"))
			System.out.println(Answer); // if the number is divided by 5
		}
	}

	
	static String FizzBuzz(int n) {
		if(n%3 == 0)
			return "Fizz";
		else
			return "None";
	}

	
}