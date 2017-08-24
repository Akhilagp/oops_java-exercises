import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListTest
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		String s;
		ArrayList<String> listi=new ArrayList<String>();
		ArrayList<String> duplListi=new ArrayList<String>();
		for(int i=0;i<10;i++)
		{
			s=input.nextLine();
			listi.add(s);		
		}
		System.out.print("\n Originallist...\n");
		for(String trav:listi)
		{
			System.out.print(trav);
			System.out.print('\n');
		}
		ArrayList<String> newListi=new ArrayList<String>();
		newListi.addAll(listi);
		for(String element:listi)
		{
			if(listi.contains(element)&&(!duplListi.contains(element)))
			{
				duplListi.add(element);
			}
		}
		System.out.print(duplListi);
		System.out.print("\n Copiedlist...\n");
		for(String trav:newListi)
		{
			System.out.print(trav);
			System.out.print('\n');
		}
		System.out.print("\n list without duplication...\n");
		for(String trav:duplListi)
		{
			System.out.print(trav);
			System.out.print('\n');
		}
		
	}
}
