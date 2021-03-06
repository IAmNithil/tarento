import java.util.Arrays;
import java.util.Scanner;


//Without order of A B C code in programtemp.java

class program
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
      {
        if((a.length()>0)||(b.length()>0)||(c.length()>0))
          return false;
        return true;
      }

      boolean checka = false;
      boolean checkb = false;
      boolean checkc = false;
      boolean isPresent;
			String asub="";
			String bsub="";
			String csub="";
			String dsub="";

      if (a.length()>0)
      {
        checka = a.indexOf(d.charAt(0)) != -1 ? true : false;
				if (checka)
				{
					dsub = d.substring(1, d.length());
					asub = a.substring(0, a.indexOf(d.charAt(0)))+a.substring(a.indexOf(d.charAt(0))+1);
					System.out.println("A "+d.charAt(0)+a.charAt(0));
				}
			}

      if (b.length()>0)
			{
        checkb = b.indexOf(d.charAt(0)) != -1 ? true : false;
				if (checkb)
				{
					dsub = d.substring(1, d.length());
					bsub = b.substring(0, b.indexOf(d.charAt(0)))+b.substring(b.indexOf(d.charAt(0))+1);
					System.out.println("B "+d.charAt(0)+b.charAt(0));
				}
			}

      if (c.length()>0)
			{
        checkc = c.indexOf(d.charAt(0)) != -1 ? true : false;
				if (checkc)
				{

					dsub = d.substring(1, d.length());
					csub = c.substring(0, c.indexOf(d.charAt(0)))+c.substring(c.indexOf(d.charAt(0))+1);
					System.out.println("C "+d.charAt(0)+c.charAt(0));
				}
			}
      return ((checka && interleave(dsub, asub, b, c)) || (checkb && interleave(dsub, a, bsub, c)) || (checkc && interleave(dsub, a, b, csub)));

  }
}
