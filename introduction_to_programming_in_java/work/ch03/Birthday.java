class Birthday {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int trials = Integer.parseInt(args[1]);

		int birthday[] = new int[n+1];
		int sum = 0;
		double fraction = 0;
		int i,j;
		int room;

		for (i = 1; i <= n; i++)
			birthday[i] = 0;

		for(i = 0; i < trials; i++) {
			room = (int)(Math.random() * n) + 1;
			birthday[room]++;
		}

		for (i = 1; i <= n; i++) {
			sum += birthday[i];
			fraction = (double)sum / (double)trials;
			System.out.println(i + "\t" + birthday[i] + "\t" + fraction);
		}
	}
}
