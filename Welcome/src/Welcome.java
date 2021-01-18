public class Welcome {
	public static void main(String[] args)
	{
		String greeting = "2.0-1.1";
		for(int i=0; i<greeting.length();i++)
			System.out.print("=");
		System.out.println();
		System.out.println(greeting);
		for(int i=0; i<greeting.length();i++)
			System.out.print("=");
		System.out.println();
		double a = 3.5000;
		int b = (int) Math.round(a);
		int c = b;
		int m = ++b;
		int n = c++;
		System.out.print(m);
		System.out.print(n);
		int x = m<n?m:n;
		System.out.print(x);
		int f = (n % (1<<3)) >> 3;
		System.out.print(f);
		String expletive = "Expletive";
		String PC13 = "deleted";
		String message  = expletive +  m;
		System.out.print(message);
		String greting = "Hello";
		int index = greting.offsetByCodePoints(0, 3);
		int p = greting.codePointAt(index);
		System.out.println();
		System.out.print(p);
	}
}
