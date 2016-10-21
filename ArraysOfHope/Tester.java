
public class Tester {

	public static void main(String[] args) {
		char alphabet[]=new char[26];
		for(int n=65, m=0;n<=90;n++, m++)
			{
			alphabet[m]=(char)n;
			}
		for(int p=0;p<=25;p++)
			{
			System.out.print(alphabet[p]+", ");
			}
	}

}
