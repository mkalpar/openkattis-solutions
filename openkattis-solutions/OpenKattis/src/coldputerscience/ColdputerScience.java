package coldputerscience;
import java.util.Scanner;

public class ColdputerScience {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		//System.out.println("enter the number of temperatures: ");
		int belowZero = 0;
		int i = 0;
		while (sc.hasNextLine()) {
			int number = Integer.valueOf(sc.nextLine());
			//System.out.println("enter the temperatures: ");
			Scanner tempScanner = new Scanner(sc.nextLine());	
			while(tempScanner.hasNextLine()) {				
				String[] str = tempScanner.nextLine().split(" ");	
				int[] temperature = new int[number];
				for (i = 0 ; i < str.length; i++) {
					temperature[i] = Integer.valueOf(str[i]);
					if (temperature[i] < 0) {belowZero++;}
				}				
			}tempScanner.close();
			System.out.println(belowZero);
		}sc.close();		
	}
}
