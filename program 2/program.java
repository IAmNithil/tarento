import java.util.Arrays;
import java.util.Scanner;

class program
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String str[] = scanner.nextLine().split(" ");
    String temp[] = new String[str.length];
    int extra=0;

    //First remove any excess space that may enter as array elements
		//System.out.println(Arrays.asList(str));
    //System.out.println(str.length);
		scanner.close();
    int i=0,j=0;
    while (i<str.length)
    {
      if (!str[i].equals(""))
      {
        temp[j]=str[i];
        j++;
      }
      else
      {
        extra++;
      }
      i++;
    }

    //array clean of excess space in str2
    String str2[] = Arrays.copyOfRange(temp, 0, temp.length-extra);
    System.out.println(Arrays.asList(str2)); //words
    System.out.println("No. of words="+str2.length);

    int ccount=0;
    int acount=0;//alphabets
    int ncount=0;//Numbers
    char c;
    i=0;
    while (i<str2.length)//traverse each word
    {
      for(j = 0; j < str2[i].length(); j++) {//traverse characters of word
            ccount++;
            c = str2[i].charAt(j);
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122))
                acount++;

            else if (c >= 48 && c <= 57)
                ncount++;
        }
        i++;
    }
    System.out.println("Characters: "+ccount+" Alphabets: "+acount+" Numbers: "+ncount);
	}
}
