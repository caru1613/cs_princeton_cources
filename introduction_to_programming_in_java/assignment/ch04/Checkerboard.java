class Checkerboard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int i, j;
		double r = 1.0/2.0;
		
		StdDraw.setScale(0.0, n);
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if(((j % 2) != 0 && (i % 2) == 0) ||
				   ((j % 2) == 0 && (i % 2) != 0) )
					StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
				else
					StdDraw.setPenColor(StdDraw.BLUE);
				StdDraw.filledSquare(j+r, i+r, r);
			}
		}
	}
}
