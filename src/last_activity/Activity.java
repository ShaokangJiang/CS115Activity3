/**
 * @author Shaokang Jiang & Shein George & Hao Zhang
 */
package last_activity;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Activity {
	
	public void main(File myfile) {
		
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		File myfile=new File("Luna.txt");
		Scanner in=new Scanner(myfile);
		int[][] a=new int[10][10];
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				a[i][j] = in.nextInt();
			}
			//in.nextLine();
		}
		in.close();
		for(int j=0;j<9;j++) {
		for(int i=0;i<9;i++) {
				a[9][j] += a[i][j];
		}
		}
		for(int j=0;j<9;j++) {
			for(int i=0;i<10;i++) {
					a[i][9] += a[i][j];
			}
			}
		for(int i=0;i<10;i++) {
		for(int value: a[i]) {
			System.out.print(value + " ");
		}
		System.out.println("");
		}
		
		}

}
