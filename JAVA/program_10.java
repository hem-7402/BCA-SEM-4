import java.util.Scanner;

class program_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }

        // simple sorting
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Max1 = " + a[0]);
        System.out.println("Max2 = " + a[1]);
        System.out.println("Max3 = " + a[2]);

        sc.close();
    }
}
