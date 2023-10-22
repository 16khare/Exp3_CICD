package devops.exp3.cicd;

public class Calculator 
{
        public int Mul(int a,int b)
        {
        	return a*b;
        }
        public int Divide(int a,int b)
        {
        	return a/b;
        }
	public static void main(String[] args)
	{
		Calculator Mycal = new Calculator();
		System.out.println(Mycal.Mul(20,10));
		System.out.println(Mycal.Divide(40,5));
	}

}
