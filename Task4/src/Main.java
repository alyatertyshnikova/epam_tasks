import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of matrix: ");
        int size=input.nextInt();

        double a[]=new double[size];
        System.out.print("\nEnter elements of matrix: ");
        for(int i=0; i<a.length; i++) {
            a[i]=input.nextDouble();
        }

        double max=Double.MIN_VALUE;
        for(int i=0; i<Math.ceil((double)a.length/2); i++) {
            if(max < (a[i]+a[a.length-1-i])) {
                max = a[i] + a[a.length - 1 - i];
            }
        }
        System.out.printf("Max: %f", max);
    }
}
