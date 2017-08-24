import java.util.Scanner;
class comp
{
    Scanner in=new Scanner(System.in);
            
        private int real;
        private int imag;
        public comp(){
          System.out.println("\n");
            
       }
        public comp(int r,int i){
            real=r;
            imag=i;
        }
        public void data()
        {
            Scanner in=new Scanner(System.in);
            System.out.print("\n enter real and imag part:");
            this.real=in.nextInt();
            this.imag=in.nextInt();
        }
        public comp sub(comp c1,comp c2){
            comp sum=new comp();
            sum.real=c1.real-c2.real;
            sum.imag=c1.imag-c2.imag;
            return sum;
        }
        
        public comp  add(comp c1,comp c2){
            comp sum=new comp();
            sum.real=c1.real+c2.real;
	    sum.imag=c1.imag+c2.imag;
		//System.out.printf("%d %d\n",sum.real,sum.imag);
	    return sum;
        }
        public void disp()
        {
		if(this.real>0||this.real<0)
		{
			if(this.imag==0){System.out.printf("%d\n",this.real);};
			if(this.imag>0){System.out.printf("%d+%di\n",this.real,this.imag);};
			if(this.imag<0){System.out.printf("%d%di\n",this.real,this.imag);};
		}
		if(this.real==0)
		{
			System.out.printf("%di\n",this.imag);
		}
        }
}
public class ComplexTest
{
    public static void main(String args[])
	{
        Scanner in=new Scanner(System.in);
    	comp c1=new comp();
    	comp c2=new comp();
    	c1.data();
    	c2.data();
    	comp c3=new comp();
    	c3=c3.add(c1,c2);
    	System.out.print("add 1 and 2\n");
    	c3.disp();
    	comp c4=new comp();
    	System.out.print("\n enter real and imag part for sub:");
    	int r1=in.nextInt();
    	int i1=in.nextInt();
    	comp c5=new comp(r1,i1);
    	System.out.print("\n enter real and imag part for sub:");
    	int r=in.nextInt();
    	int i=in.nextInt();
    	comp c6=new comp(r,i);
    	c4=c4.sub(c5,c6);
    	System.out.print("Subtracts the 3 and 4\n");
    	c4.disp();
	}
}

