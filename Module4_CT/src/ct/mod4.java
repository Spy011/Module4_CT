package ct;
import java.util.Arrays;
import java.util.Scanner;

public class mod4 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in); 
		int classSize = 10;
		
		float[] grades = new float[classSize];
		
		System.out.println("Please enter grades:");
		for(int i = 0; i < classSize; i++)
		{
			if (userInput.hasNextFloat())
			{
				grades[i] = userInput.nextFloat();
			}
		}
		System.out.println("The grades you entered were:");
		for (int i = 0; i < classSize; i++)
		{
			System.out.print(grades[i] + "; ");
		}
		System.out.println();
		
		Arrays.sort(grades);
		
		System.out.println("The lowest grade in the class was " + grades[0]);
		System.out.println("The highest grade in the class was " + grades[grades.length - 1]);
		
		float sum = 0;
		float size = grades.length; 
		
		for(int i = 0; i < grades.length; i++)
		{
			sum += grades[i];
		}
		float avg = sum/size; 
		System.out.println("The average grade was " + avg);
		
		userInput.close();
	}
}
