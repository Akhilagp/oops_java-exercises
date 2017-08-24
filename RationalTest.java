import java.util.Scanner;
class Rational
{
	private double nr,dr;
	public void getData()
	{
		Scanner input=new Scanner(System.in);
		System.out.print("\nenter  numerator:");
		this.nr=input.nextDouble();
		System.out.print("\nenter  denominator:");
		this.dr=input.nextDouble();
		if(this.dr==0.0)
		{
		throw new IllegalArgumentException("no division by zero\n");
		}
		
	}
	public Rational()
	{
		System.out.print("...\n");
	}
	public Rational add(Rational r1)
	{
		Rational r=new Rational();	
		r.nr=(this.nr*r1.dr)+(this.dr*r1.nr);
		r.dr=this.dr*r1.dr;
		return r;
	}
	public Rational subtract(Rational r1)
	{
		Rational r=new Rational();	
		r.nr=(this.nr*r1.dr)-(this.dr*r1.nr);
		r.dr=this.dr*r1.dr;
		return r;
	}
	public void display()
	{
		double l=this.nr/this.dr;
		System.out.printf("The decimal representation:%f\n",l);
	}
	@Override
	public String toString()
	{
		//System.out.print('\n');
		return String.format("\nThe rational number is %f/%f\n", this.nr,this.dr);
		
		
	}
}

public class RationalTest
{
	public static void main(String args[])
	{
		Rational r1=new Rational();
		Rational r2=new Rational();
		try
		{
			r1.getData();
			
		}
		catch(IllegalArgumentException e)
		{
			System.out.print(e.getMessage());
			System.out.print("\n Change your input!!");
			r1.getData();
		}
		try
		{
			r2.getData();
			
		}
		catch(IllegalArgumentException e)
		{
			System.out.print(e.getMessage());
			System.out.print("\n Change your input!!");
			r2.getData();
		}
		
		Rational r3=new Rational();
		Rational r4=new Rational();		
		r3=r1.add(r2);
		r4=r1.subtract(r2);		
		System.out.print(r1);
		System.out.print(r2);
		System.out.print("\n Performing Addition...\n");
		System.out.print(r3);
		r3.display();
		System.out.print("\n Performing Subtraction...\n");
		System.out.print(r4);
		r4.display();

	}

}

