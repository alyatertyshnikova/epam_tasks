import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double a=0, b=0, h=0;
        do {
            if(a>=b)
            {
                System.out.print("b should be bigger than a\n");
                System.out.print("Enter a:");
                a = input.nextDouble();
                System.out.print("Enter b:");
                b = input.nextDouble();
            }
            if(h<=0)
            {
                System.out.print("h should be bigger than 0\n");
                System.out.print("Enter h:");
                h = input.nextDouble();
            }
        }
        while(a>b || h<0);


        double f;
        int i=0;
        for(double x=a; x<=b; x+=h)
        {
            f=Math.tan(2*x)-3;
            System.out.printf("%.1f\t%.4f\n", x, f);
        }
    }
}
