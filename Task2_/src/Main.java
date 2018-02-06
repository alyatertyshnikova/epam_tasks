public class Main {
        public static void main(String[] args) {
            int n=10;
            double min=n, epsilon=1.2;
            double[] A = new double[n];

            for (int i = 0; i < n; i++) {
                A[i] = 1 / Math.pow((i + 1), 2);
                if (A[i] < min && A[i] < epsilon)
                    min=A[i];
            }

            System.out.print("a: ");
            for (int i = 0; i < n; i++) {
                System.out.printf("%.4f" + " ", A[i]);
            }
            if (min == n)
                System.out.printf("\nNot found");
            else
                System.out.printf("\nmin: %.4f", min);
        }

}
