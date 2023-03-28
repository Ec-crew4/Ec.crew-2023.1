package Backjoon;
import java.util.Scanner;

public class Q11721 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		String InputSetence=scan.next();
		
		char[]arr=new char[InputSetence.length()];
		
		for(int i=0;i<InputSetence.length();i++)
		{
			
			arr[i]=InputSetence.charAt(i);
			if(i%10==0&&i!=0)
			{
				System.out.println();
			}
			System.out.print(arr[i]);
			
			
		}
		
        
	}

}
