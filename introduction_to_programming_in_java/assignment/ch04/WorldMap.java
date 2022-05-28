class WorldMap {
	public static void main(String[] args) {
		int nWidth = StdIn.readInt();
		int nHeight = StdIn.readInt();
		String sState;
		int nVertices;
		int i;

		/*
		StdOut.println(nWidth + " " + nHeight);
		*/
		StdDraw.setCanvasSize(nWidth, nHeight);
		StdDraw.setXscale(0, nWidth);
		StdDraw.setYscale(0, nHeight);

		while(!StdIn.isEmpty())
		{
			sState = StdIn.readString();
			/*
			StdOut.println(sState);
			*/
			nVertices = StdIn.readInt();
			/*
			StdOut.println(nVertices);
			*/
			double[] x_vertice = new double[nVertices];
			double[] y_vertice = new double[nVertices];

			for (i=0; i < nVertices; i++) {
				x_vertice[i] = StdIn.readDouble();
				y_vertice[i] = StdIn.readDouble();
				/*
				StdOut.println(x_vertice[i] + " " + y_vertice[i]);
				*/
			}
			StdDraw.polygon(x_vertice, y_vertice);
		}

		/*
		StdOut.println(entropy);
		*/
	}
}
