public class Main {
    public static void main(String[] args)
    {
        double a=0, b=10, h=1.5;
        double[] F= new double[10];
        int i=0;
        for(double x=a; x<b; x+=h)
        {
            F[i]=Math.tan(2*x)-3;
            System.out.printf("%.1f\t%.4f\n", x, F[i]);
            i++;
        }
    }
}
