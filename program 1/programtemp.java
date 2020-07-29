import java.util.Arrays;
import java.util.Scanner;
//without order of A B C
class programtemp
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String str[] = scanner.nextLine().split(" ");

		System.out.println(Arrays.asList(str));
    System.out.println(str.length);
		scanner.close();

    System.out.println(interleave(str[0], str[1], str[2], str[3]));
  }

  private static boolean interleave(String d, String a, String b, String c) {
      if (d.length()==0)
          return true;

      boolean matcha = false;
      boolean matchb = false;
      boolean matchc = false;
			String asub="";
			String bsub="";
			String csub="";
			String dsub="";

      if (a.length()>0)
      {
				checka = (d.charAt(0) == a.charAt(0));
				if (matcha)
				{
					dsub = d.substring(1, d.length());
					asub = a.substring(1, a.length());
					System.out.println("A "+d.charAt(0)+a.charAt(0));
				}
			}

      if (b.length()>0)
			{
				matchb = (d.charAt(0) == b.charAt(0));
				if (matchb)
				{
					dsub = d.substring(1, d.length());
					bsub = b.substring(1, b.length());
					System.out.println("B "+d.charAt(0)+b.charAt(0));
				}
			}

      if (c.length()>0)
			{
				matchc = (d.charAt(0) == c.charAt(0));
				if (matchc)
				{

					dsub = d.substring(1, d.length());
					csub = c.substring(1, c.length());
					System.out.println("C "+d.charAt(0)+c.charAt(0));
				}
			}

      return ((matcha && interleave(dsub, asub, b, c)) || (matchb && interleave(dsub, a, bsub, c)) || (matchc && interleave(dsub, a, b, csub)));

  }
}
