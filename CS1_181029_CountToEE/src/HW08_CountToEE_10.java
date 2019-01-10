import java.util.Scanner;

public class HW08_CountToEE_10 {
	
	static int row, col;
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Prompt the user to choose Rectangle or Square.
		System.out.print("Which one do you want? Rectangle or Square? Press R for Rectangle or S for Square: ");
		char rors = input.next().charAt(0); // rors: rectangle or square
		rors = Character.toUpperCase(rors);
		System.out.println("");

		// Prompt the user to choose how big the table is.
		if (rors == 'S') {
			System.out.print("How long do you want for the square?: ");
			row = col = input.nextInt();
			MakeATable(row, col);
		} else if (rors == 'R') {
			System.out.print("How many rows do you want?: ");
			row = input.nextInt();
			System.out.print("How many columns do you want?: ");
			col = input.nextInt();
			MakeATable(row, col);
		} else {
			System.out.println("ERROR: You should press only S or R");
		}

		input.close();
	} // End of void method

	private static void MakeATable(int row, int col) {
		System.out.println(""); // �씠嫄� �쐞�뿉 �쟻�쓣源� 諛묒뿉 �쟻�쓣源�

		if (row<=0 || col<=0) {
			System.out.println("ERROR: You should write an natural number.");
		} else if (row<=26 && col<=26) {
			
			String[][] hooray = new String[row][col];
			
			for (int i=0; i<hooray.length; i++) {	// .length 留먭퀬 嫄� row�옉 col濡� �븯硫� �븞�릺�굹? �몮以묒뿉 萸먭� �뜑 �렪�븷源�?
				for (int j=0; j<hooray[i].length; j++) {
					String alRow = Character.toString((char)('A' + i));
					String alCol = Character.toString((char)('A' + j));	// char �뿬�윭媛쒕�� string�삤濡� �븯�뒗嫄� �씠�젃寃� �븯�뒗嫄� 留욌굹?
					hooray[i][j] = alRow + alCol;
					System.out.print(hooray[i][j]+"\t");
				}
				System.out.println("");
			} // End of for loop

		} else
			System.out.println("ERROR: You should write a number under 26.");

	} // end of make a table method
} // End of class