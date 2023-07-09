public class AudioCollage {

    public static double[] amplify(double[] a, double alpha) {

        int i = 0;
        double [] ret = new double[a.length];

        for( i = 0;  i < a.length; i++ )
            ret[i] = a[i] * alpha;

        return ret;
    }

    public static double[] reverse(double[] a) {

        int i = 0;
        double [] ret = new double[a.length];

        for (i = 0; i < a.length; i++ )
            ret[i] = a[a.length-i-1];
            
        return ret;
    }

    public static double[] merge(double[] a, double[] b) {

        double[] ret = new double[a.length+b.length];

        int i = 0;

        for (i = 0; i < a.length; i++)
            ret[i] = a[i];

        for (i = 0; i < b.length; i++)
            ret[a.length + i] = b[i];

        return ret;
    }

    public static double[] mix(double[] a, double[] b) {

        int i = 0;
        double[] ret;

        if(a.length < b.length) {
            for(i = 0; i < a.length; i++)
                b[i] += a[i];
            ret = b;    
        } else {
            for(i = 0; i < b.length; i++)
                a[i] += b[i];
            ret = a;
        }

        return ret;
    }

    public static double[] changeSpeed(double[] a, double alpha) {

        double[] ret = new double[(int)(a.length/alpha)];
        int i;

        for (i = 0; i < a.length/alpha; i++)
            ret[i] = a[(int)(i*alpha)];
    
        return ret;
    }

    public static void main(String[] args) {

        double[] beatbox, buzzer, chimes, cow, dialup;
        double alpha = 2.0;
        double [] ret;

        beatbox = StdAudio.read("beatbox.wav");
        buzzer = StdAudio.read("buzzer.wav");
        chimes = StdAudio.read("chimes.wav");
        cow = StdAudio.read("cow.wav");
        dialup = StdAudio.read("dialup.wav");

        ret = amplify(beatbox, alpha);
        StdAudio.play(ret);
        ret = reverse(beatbox);
        StdAudio.play(ret);
        ret = merge(beatbox, buzzer);
        StdAudio.play(ret);
        ret = mix(beatbox, buzzer);
        StdAudio.play(ret);
        ret = changeSpeed(beatbox, alpha); 
        StdAudio.play(ret);
    }
}

