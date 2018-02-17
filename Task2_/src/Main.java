import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double epsilon=1.0, a;

        System.out.print("Enter the epsilon:");
        epsilon=input.nextDouble();
if (epsilon>0) {
        int i = 1;

        do {
            a = 1 / Math.pow(i + 1, 2);
            System.out.format("a[%d]=%.4f\n", i, a);
            i++;
        }
        while (a > epsilon);
        System.out.print("Minimal index: " + (i-1) + "\n");
        }
    }
}
