import java.util.Scanner;

public class Firstr {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[][] a = {
				{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
			};
			for(int i = 0; i < 3; i++) {
			  for(int j = 0; j < 4; j++) {
			    System.out.print(a[j] + " ");
			  }
			  System.out.println();
			}
	}

}
