class program_14 {

    static int findMax(int a[], int n) {

        if (n == 1)
            return a[0];

        int max = findMax(a, n - 1);

        if (a[n - 1] > max)
            return a[n - 1];
        else
            return max;
    }

    public static void main(String[] args) {

        int a[] = {12, 45, 7, 89, 23};
        int n = a.length;

        int result = findMax(a, n);

        System.out.println("Maximum element is: " + result);
    }
}
