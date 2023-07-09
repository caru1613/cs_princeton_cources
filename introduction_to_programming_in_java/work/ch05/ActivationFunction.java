class ActivationFunction {


	public static double heaviside(double x) {

		double ret = 0.0;

		if (x < 0)
			ret = 0.0;
		else if (x == 0)
			ret = 0.5;
		else if (x > 0)
			ret = 1.0;
        else
            ret = Double.NaN;
			
		return ret;
	}

	public static double sigmoid(double x) {

		return 1.0 / ( 1.0 + Math.pow(Math.E, -x));
	}

	public static double tanh(double x) {

		return (Math.pow(Math.E, x) - Math.pow(Math.E, -x)) / (Math.pow(Math.E, x) + Math.pow(Math.E, -x));
	}

	public static double softsign(double x) {

		return x / (1.0 + Math.abs(x));
	}

	public static double sqnl(double x) {

		double ret = 0;

		if (x <= -2.0)
			ret = -1.0;
		else if (x > -2.0 && x < 0.0)
			ret = x + (Math.pow(x, 2) / 4.0);
		else if (x >= 0.0 && x < 2.0)
			ret = x - (Math.pow(x, 2) / 4.0);
		else if (x >= 2.0)
			ret = 1.0;

		return ret;
	}

	public static void main(String[] args) {

		double x = Double.parseDouble(args[0]);
		double ret;
		ret = heaviside(x);
		StdOut.printf("heaviside(%s) = ", args[0]);
		StdOut.println(ret);

		ret =  sigmoid(x);
		StdOut.printf("  sigmoid(%s) = ", args[0]);
		StdOut.println(ret);

		ret = tanh(x);
		StdOut.printf("     tanh(%s) = ", args[0]);
		StdOut.println(ret);

		ret = softsign(x);
		StdOut.printf(" softsign(%s) = ", args[0]);
		StdOut.println(ret);

		ret = sqnl(x);
		StdOut.printf("     sqnl(%s) = ", args[0]);
		StdOut.println(ret);
	}
}
