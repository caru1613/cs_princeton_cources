class ShannonEntropy {
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int i;
		int count = 0;
		int[] p = new int[m+1];
		double pi = 0;
		double entropy = 0.0;

		while(!StdIn.isEmpty())
		{
			int x = StdIn.readInt();
			p[x]++;
			count++;
		}

		for(i = 1; i <= m; i++) {
			pi = (double)p[i]/(double)count;	
			/*
			StdOut.println(i+"pi:"+pi);
			*/
			if(pi != 0)
				entropy -= (pi * (Math.log10(pi) / Math.log10(2)));
			/*
			StdOut.println(i+"entropy:"+entropy);
			*/
		}
		StdOut.printf("%.4f",entropy);
	}
}
