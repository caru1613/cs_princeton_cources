
class DiscreteDistribution {

	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int l = args.length;
		int i = 1;
		int a[] = new int[l];
		int S[] = new int[l];
		int r;

		S[0] = 0;
		for (; i< l; i++) {
			a[i] = Integer.parseInt(args[i]);
			S[i] = S[i-1] + a[i];
		}

		while (m > 0) {
			r = (int)(Math.random()* S[l-1]);
			
			for (i = 1; i < l; i++) {
				if(r < S[i]) {
					System.out.print(i+" ");	
					break;
				}
			}

			m--;
		}
		
	}	
}
