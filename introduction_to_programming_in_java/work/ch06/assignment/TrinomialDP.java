public class TrinomialDP {

    static long[][] nk;

    static int size_n;
    static int size_k;

    static int input_n;
    static int input_k;

    static int base_n;
    static int base_k;

    static int start_n;
    static int start_k;

    static int end_n;
    static int end_k;

    public static void initnk(int n, int k)
    {
        input_n = n;
        input_k = k;

        base_n = n;
        base_k = (n/2) + 1;

        start_n = 0;
        start_k = -base_k;

        end_n = n;
        end_k = n+1;

        size_n = n+1; 
        size_k = base_k + end_k + 1;

        nk = new long[size_k][size_n];
/*
        StdOut.println("input_n :" + input_n);
        StdOut.println("input_k :" + input_k);

        StdOut.println("base_n :" + base_n);
        StdOut.println("base_k :" + base_k);

        StdOut.println("start_n :" + start_n);
        StdOut.println("start_k :" + start_k);

        StdOut.println("end_n :" + end_n);
        StdOut.println("end_k :" + end_k);

        StdOut.println("size_n :" + size_n);
        StdOut.println("size_k :" + size_k);
*/
    }

    public static void printnk()
    {
        for (int j = 0; j < size_k; j++)
        {
            for (int i = 0; i < size_n; i++)
            {
                StdOut.print(nk[j][i]);
                StdOut.print(",");
            }
            StdOut.println("");
        }
    }

    public static void setnk(int x, int y)
    {
        int n = x;
        int k = y + start_k;

 //       StdOut.println("++setnk[" + x + ',' + y + '(' + n + ',' + k + ')' + ']');
        
        if ((n == 0) && (k == 0))
        {
 //           StdOut.println("++ case 1");
            nk[y][x] = 1;
        }
        else if ((k < (-n)) || (k > n))
        {
//           StdOut.println("++ case 2" + "(" + x + "," + y +")");

            nk[y][x] = 0; 
        }
        else if ( n+k == 0)
        {
//            StdOut.println("++ case 3");
            nk[y][x] = 1;
        }
        else if ( (y < 0) || (x < 0) || (y >= size_k) || (x >= size_n))
        {
//            StdOut.println("++ case 4");
//            StdOut.println("out of range." + '(' + x + ',' + y + ')');
        }
        else
        {
//            StdOut.println("++ case 5");
            nk[y][x] = getnk(x-1, y-1) + getnk(x-1,y) + getnk(x-1,y+1);
        }
    }

    public static long getnk(int x, int y)
    {
        int n = x;
        int k = y + start_k;
        long ret = 0;

//        StdOut.println("  getnk[" + x + ',' + y + '(' + n + ',' + k + ')' + ']');

        if ((n == 0) && (k == 0))
        {
//            StdOut.println("  case 1");
            ret = 1;
        }
        else if ((k < (-n)) || (k > n))
        {
//            StdOut.println("  case 2");
            ret = 0; 
        }
        if ( (y < 0) || (x < 0) || (y >= size_k) || (x >= size_n))
        {
//            StdOut.println("  case 3");
//            StdOut.println("out of range." + '(' + x + ',' + y + ')');
            ret = 0;
        }
        else
        {
//            StdOut.println("  case 4");
            ret = nk[y][x];
        }
        return ret;
    }

    // Returns the trinomial coefficient T(n, k).
    public static long trinomial()
    {
        int x = 0, y = 0;

        for (x = 0; x < size_n; x++)
        {
            for (y = 0; y < size_k; y++)
            {
                setnk(x,y); 
                if ((x == input_n) && (y == input_k+base_k))
                    break;
            }
        } 

        return nk[input_k+base_k][input_n];
    }

    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        long ret;

        initnk(n,k);
        ret = trinomial();

        StdOut.println(ret);

        //printnk();
    }
}

