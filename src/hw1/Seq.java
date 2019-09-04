package hw1;

import java.util.Random;

public class Seq 
{
	public static void main(String[] args) 
	
	{
		int counts = 0;
		
		Random rand = new Random();
			
		String[] arr = new String[] {"A","T","C","G"};
		
		String counter = "AAA";
		
		for (int x = 0; x < 1000; x++)
		{
			String test = (arr[rand.nextInt(4)] + arr[rand.nextInt(4)] + arr[rand.nextInt(4)]);
			if (counter.equals(test))
				counts++;
		
			System.out.println(test);
		}
		System.out.println(counts);
	} 
	
	
}	
//By chance, we would expect to see AAA 3-mer 15.625 times ((.25^3)*1000)). The Java number is relatively close to this number.

