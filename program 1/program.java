import java.util.Arrays;
import java.util.Scanner;

class program
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String str[] = scanner.nextLine().split(" ");

		System.out.println(Arrays.asList(str));
    System.out.println(str.length);
		scanner.close();
	}
}
