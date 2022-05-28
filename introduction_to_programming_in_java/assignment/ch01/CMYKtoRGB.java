public class CMYKtoRGB {
    public static void main(String[] args)
    {
        double c = Double.parseDouble(args[0]);
        double m = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        double k = Double.parseDouble(args[3]);

        double w = 1.0 - k;
	    double nc = 1.0 - c;
	    double nm = 1.0 - m;
	    double ny = 1.0 - y;
        double r = (255.0 * w * nc);
        double g = (255.0 * w * nm);
        double b = (255.0 * w * ny);

        System.out.println("red =   " + Math.round(r));
        System.out.println("green = " + Math.round(g));
        System.out.println("blue =  " + Math.round(b));
    }
}
