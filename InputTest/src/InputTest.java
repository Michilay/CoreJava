import java.io.Console;
import java.util.*;

public class InputTest {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Who is the person that loves you most?");
		String name = in.nextLine();
		System.out.println("How old is she?");
		int old = in.nextInt();
		Date day = new Date();
		System.out .print("You love " + name + ".And she's age is " + old + ".Today is " + day + ".");
	}
}
