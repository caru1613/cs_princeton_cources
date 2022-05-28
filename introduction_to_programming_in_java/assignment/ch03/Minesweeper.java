class Minesweeper {

	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);
		int x, y;
		
		int mine[][] = new int[m][n]; // y,x
		for (y = 0; y < m; y++) {
			for( x = 0; x < n; x++) {
				mine[y][x] = 0;
			}
		}

		while(k != 0) {
			while(true) {
				x = (int)(Math.random() * n);
				y = (int)(Math.random() * m);
				
				if (mine[y][x] != 9) {
					mine[y][x] = 9;
					break;
				}
			}
			k--;
		}

		for (y = 0; y < m; y++) {
			for( x = 0; x < n; x++) {
				if(mine[y][x] == 9)
					continue;
				if(x-1 >= 0 && mine[y][x-1] == 9)	
					mine[y][x]++;
				if(x+1 < n &&  mine[y][x+1] == 9)
					mine[y][x]++;
				if(y-1 >= 0 && mine[y-1][x] == 9)
					mine[y][x]++;
				if(y+1 < m && mine[y+1][x] == 9)
					mine[y][x]++;
				if(y-1 >= 0 && x-1 >= 0 && mine[y-1][x-1] == 9)
					mine[y][x]++;
				if(y-1 >= 0 && x+1 < n && mine[y-1][x+1] == 9)
					mine[y][x]++;
				if(y+1 < m && x-1 >= 0 && mine[y+1][x-1] == 9)
					mine[y][x]++;
				if(y+1 < m && x+1 < n && mine[y+1][x+1] == 9)
					mine[y][x]++;
			}
		}

		for (y = 0; y < m; y++) {
			for( x = 0; x < n; x++) {
				if(mine[y][x] == 9)
					System.out.print("*  ");
				else
					System.out.print(mine[y][x] + "  ");
			}
			System.out.println("");
		}
	}
}
