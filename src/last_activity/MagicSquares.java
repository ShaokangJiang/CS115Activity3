/**
 * @author Shaokang Jiang & Shein George & Hao Zhang
 */
package last_activity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class MagicSquares {

public void main(File myfile) throws IOException {
	int diagonals1 = 0,diagonals2 = 0;
	for(int i=0;i<20;i++) {
		System.out.print("- ");
	}
	System.out.println("");
	System.out.println("Start testing " + myfile.getName() + "...");
	for(int i=0;i<20;i++) {
		System.out.print("- ");
	}
	System.out.println("");
	Scanner in=new Scanner(myfile);
	String h = in.nextLine();
	int q = h.split("\t").length;
	in.close();//why i can't use reset here?
	Scanner in1=new Scanner(myfile);
	int[][] a=new int[q+1][q+1];
	boolean l = true;
	for(int i=0;i<q;i++) {
		for(int j=0;j<q;j++) {
			a[i][j] = in1.nextInt();
		}
	}
	in1.close();
	for(int j=0;j<q;j++) {
	for(int i=0;i<q;i++) {
			a[q][j] += a[i][j];
	}
	}
	for(int j=0;j<q;j++) {
		for(int i=0;i<q;i++) {
				a[i][q] += a[i][j];
		}
		}
	for(int i=0;i<q;i++) {
		diagonals1 += a[i][i];
	}
	for(int i=0;i<q;i++) {
		diagonals2 += a[q-1-i][i];
	}
	for(int i=0;i<q;i++) {
		if(a[i][q]==a[q][i]); else {
			l=false;
			break;
		}
	}
	if(l) {
		if((a[0][q]==diagonals1)&&(diagonals2==a[0][q])) System.out.println("All rows, all columns, and both diagonals sum to the same constant.");
		else System.out.println("Not all rows, all columns, and both diagonals sum to the same constant.");
	}else System.out.println("Not all rows, all columns, and both diagonals sum to the same constant.");
	System.out.println("");
	}

	public static void main(String[] args) throws IOException {
		MagicSquares a = new MagicSquares();
		
		
		a.main(new File("Luna.txt"));
		a.main(new File("Mercury.txt"));
		
		
		}
}
