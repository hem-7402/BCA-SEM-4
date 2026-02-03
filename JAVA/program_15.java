class program_15 {

    static int findSum(int a[], int n) {

        // base condition
        if (n == 0)
            return 0;

        // recursive call
        return a[n - 1] + findSum(a, n - 1);
    }

    public static void main(String[] args) {

        int a[] = {10, 20, 30, 40, 50};
        int n = a.length;

        int sum = findSum(a, n);

        System.out.println("Sum of array elements is: " + sum);
    }
}
