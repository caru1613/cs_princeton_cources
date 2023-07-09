class Divisors {

	public static int gcd(int a, int b) {

        int tmp = 0;
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {

            if (a < b) {
                tmp = a;
                a = b;
                b = tmp;
            } else {
                a = a % b;
            }
        }
        return a;
	}

	public static int lcm(int a, int b) {

        int gcd_value = gcd(a,b);

        if(gcd_value == 0)
            return 0;

        a = Math.abs(a);
        b = Math.abs(b);

		return (a * b) / gcd_value;
	}

	public static boolean areRelativelyPrime(int a, int b) {

		boolean ret;
		int gcd_value = gcd(a,b);

		if(gcd_value == 1)
			ret =  true;
		else
			ret = false;

		//StdOut.println(gcd_value);
		return ret;
	}

	public static int totient(int n) {

		int ret = 0;

		for (int i = 1; i <= n; i++) {
			if(areRelativelyPrime(i, n))
				ret++;
		}

		return ret;
	}

	public static void main(String[] args) {
		int iret;
		boolean bret;

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

		iret = gcd(a,b);
		StdOut.printf("gcd(%d, %d) = %d\n", a, b, iret);

		iret = lcm(a,b);
		StdOut.printf("lcm(%d, %d) = %d\n", a, b, iret);

		bret = areRelativelyPrime(a,b);
		StdOut.printf("areRelativelyPrime(%d, %d) = %b\n", a, b, bret);

		iret = totient(a);
		StdOut.printf("totient(%d) = %d\n", a, iret);

		iret = totient(b);
		StdOut.printf("totient(%d) = %d\n", b, iret);
	}

}
