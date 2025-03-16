import java.util.Scanner;

public class five{
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number");
		int i=scanner.nextInt();
		scanner.close();
		
		for(int j=1; j<=i; j++) {
			if(j <= i/2) {
			System.out.print(" "+((i/2)+1-j));
			}
			else{
				System.out.print(" "+j);
		
	}
}
      System.out.println();
	}
}