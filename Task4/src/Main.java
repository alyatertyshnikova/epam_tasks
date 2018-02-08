public class Main {
    public static void main(String[] args)
    {
        double A[]={1.5, 3, 2.4, 1.0001};
        double max=Double.MIN_VALUE;
        for(int i=0; i<A.length; i++)
        {
            if(max < (A[i]+A[A.length-1-i]))
                max=A[i]+A[A.length-1-i];
        }
        System.out.printf("Max: %f", max);
    }
}
