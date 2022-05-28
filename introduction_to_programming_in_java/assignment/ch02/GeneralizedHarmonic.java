class GeneralizedHarmonic {

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int r = Integer.parseInt(args[1]);
		double h = 0;
		int i = 1;

		for(; i<=n; i++) {
			h += 1 / Math.pow(i, r);
		}
		System.out.println(h);
	}
}
