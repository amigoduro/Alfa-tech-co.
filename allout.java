class alfa
{
	
	int a,b;
	void addition(int x,int y)
	
	{
		a=x;
		b=y;
	}
	int sum()
	{
	
		return(a+b);
	
	}
}

class bita extends alfa
{
	
	int c,d,e;
	
	void subtract(int x)
	{
		c=x;
		//d=y;
	}
	int minus()
	{
		return(sum()-c);
	}
}

class charli extends bita
{
	int f,g,k;
	void multiply(int x)
	{
		f=x;
		//g=y;
	}
	int multi()
	{
		return(minus()*f);
	}
}

class delta extends charli
{
	int l,m,n;
	void divide(int x)
	{
		l=x;
		//m=y;
	}
	int div()
	{
		return(multi()/l);
	}
}
class allout
{
	public static void main (String args[])
	{
		delta i = new delta();
		i.addition(10,10);
		i.subtract(5);
		i.multiply(10);
		i.divide(10);
		System.out.println("Answer's of addition are =  "+i.sum());
		System.out.println("Answer's of subtraction are =  "+i.minus());
		System.out.println("Answer's of multiplication are =  "+i.multi());
		System.out.println("Answer's of divide are =  "+i.div());
	}
}
