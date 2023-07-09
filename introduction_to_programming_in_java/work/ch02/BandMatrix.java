class BandMatrix {
	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);
		int width = Integer.parseInt(args[1]);
		int i = 0, j;

		for (; i < n; i++) {
			for(j = 0; j < n; j++) {
				if (Math.abs(i-j) <= width) {
					System.out.print("*");
				} else {
					System.out.print("0");
				}

				if( j < n-1)
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
