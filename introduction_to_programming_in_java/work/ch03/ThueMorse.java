class ThueMorse {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		boolean [][] ThueMorse = new boolean[n][n];
		int i = 0, j = 0;
		int w = 0;

		ThueMorse[0][0] = false;
		
		/* Thue-Morse Sequence */	
		for (j = 1; j < n; j*=2) {
			for( w = 0; w < j; w++)
				if( j+w >= n)
					break;
				else
					ThueMorse[0][j+w] = !ThueMorse[0][w];
		}

		for (i = 1; i < n; i++) {
			for (j = 0; j < n; j++) {
				ThueMorse[i][j] = ThueMorse[0][i] == ThueMorse[0][j] ? false : true;

			}
		}
		
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (!ThueMorse[i][j]) {
					System.out.print("+");
				} else {
					System.out.print("-");
				}
				if(j != n-1)
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
