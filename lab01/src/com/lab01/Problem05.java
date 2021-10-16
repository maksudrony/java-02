package exam;
/*Habib wants to draw a pattern dynamically. He inputs an integer number 
 * and a pattern like below will be generated. Suppose Habib inputs 5. 
 *    1
 *   212
 *  32123 
 * 4321234
 *543212345*/
public class Problem05{
	public static void main(String[] args) {
		int m = 5;
		for( int i=1; i<=m; i++) {
			for (int a = i; a < m; a++) {
				System.out.print(" ");
			}

			for (int x = i; x >= 1; x--) {
				System.out.print(x);
				
			}
			for (int y = 2; y <= i; y++) {
				System.out.print(y);
				
			}
			
			System.out.println();
		}
	}
}
